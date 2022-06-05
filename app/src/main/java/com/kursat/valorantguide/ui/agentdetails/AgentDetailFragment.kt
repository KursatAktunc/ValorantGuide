package com.kursat.valorantguide.ui.agentdetails

import androidx.fragment.app.viewModels
import com.kursat.valorantguide.R
import com.kursat.valorantguide.base.BaseFragment
import com.kursat.valorantguide.databinding.FragmentAgentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AgentDetailFragment : BaseFragment<FragmentAgentDetailBinding, AgentDetailViewModel>() {

    override val mViewModel: AgentDetailViewModel by viewModels()

    override fun bindLayoutId(): Int = R.layout.fragment_agent_detail

    override fun initViews() {
    }
}