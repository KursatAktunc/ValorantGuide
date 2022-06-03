package com.kursat.valorantguide.ui.agents

import androidx.fragment.app.viewModels
import com.kursat.valorantguide.R
import com.kursat.valorantguide.base.BaseFragment
import com.kursat.valorantguide.databinding.FragmentAgentsListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AgentsListFragment : BaseFragment<FragmentAgentsListBinding, AgentsListViewModel>() {

    override val mViewModel: AgentsListViewModel by viewModels()

    override fun bindLayoutId(): Int = R.layout.fragment_agents_list

    override fun initViews() {

    }

}