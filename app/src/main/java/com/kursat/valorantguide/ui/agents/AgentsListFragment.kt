package com.kursat.valorantguide.ui.agents

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.kursat.valorantguide.R
import com.kursat.valorantguide.base.BaseFragment
import com.kursat.valorantguide.base.ResourceStatus
import com.kursat.valorantguide.databinding.FragmentAgentsListBinding
import com.kursat.valorantguide.ui.agents.adapter.AgentsListAdapter
import com.kursat.valorantguide.util.Constants
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

private const val TAG: String = "AgentsListFragment"

@AndroidEntryPoint
class AgentsListFragment : BaseFragment<FragmentAgentsListBinding, AgentsListViewModel>() {

    override val mViewModel: AgentsListViewModel by viewModels()

    override fun bindLayoutId(): Int = R.layout.fragment_agents_list

    private lateinit var adapter: AgentsListAdapter

    override fun initViews() {
        mViewModel.getAllAgents(Constants.LANG_ENG)
        viewLifecycleOwner.lifecycleScope.launch {
            mViewModel.agentResource.collect {
                when (it.status) {
                    ResourceStatus.PROGRESS -> {
                        Log.v(TAG, "progress")
                    }
                    ResourceStatus.SUCCESS -> {
                        Log.v(TAG, "success")
                        adapter = AgentsListAdapter(it.data?.data!!)
                        mBinding.agentsListRV.adapter = adapter
                        mBinding.agentsListRV.setHasFixedSize(true)
                    }
                    ResourceStatus.ERROR -> {
                        Log.v(TAG, mViewModel.agentResource.value.error?.errorMessage.toString())
                        mViewModel.getAllAgents(Constants.LANG_ENG)
                    }
                }
            }
        }
    }
}