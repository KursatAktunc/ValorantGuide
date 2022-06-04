package com.kursat.valorantguide

import androidx.activity.viewModels
import com.kursat.valorantguide.base.BaseActivity
import com.kursat.valorantguide.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>() {

    override val mViewModel: MainActivityViewModel by viewModels()

    override fun bindLayoutId(): Int = R.layout.activity_main

    override fun initViews() {

    }
}