package com.kursat.valorantguide.ui.agents

import androidx.lifecycle.viewModelScope
import com.kursat.valorantguide.base.BaseViewModel
import com.kursat.valorantguide.base.Resource
import com.kursat.valorantguide.base.ResourceError
import com.kursat.valorantguide.base.ResourceStatus
import com.kursat.valorantguide.model.AgentsSample
import com.kursat.valorantguide.repository.AgentsListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AgentsListViewModel @Inject constructor(private val repository: AgentsListRepository) :
    BaseViewModel() {

    private val _agentResource =
        MutableStateFlow<Resource<AgentsSample>>(Resource(ResourceStatus.PROGRESS))
    val agentResource: StateFlow<Resource<AgentsSample>> = _agentResource

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        _agentResource.value = Resource(
            ResourceStatus.ERROR,
            null,
            throwable.localizedMessage?.let { ResourceError(62, it) })
    }

    fun getAllAgents(language: String) {
        _agentResource.value = Resource(ResourceStatus.PROGRESS)

        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val response = repository.getAllAgents(language, isPlayableCharacter = true)

            if (response.isSuccessful)
                _agentResource.value = Resource(ResourceStatus.SUCCESS, response.body())
            else
                _agentResource.value =
                    Resource(ResourceStatus.ERROR, null, ResourceError(61, response.message()))
        }
    }
}