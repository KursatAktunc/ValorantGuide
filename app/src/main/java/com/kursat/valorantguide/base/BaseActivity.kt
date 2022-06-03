package com.kursat.valorantguide.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T : ViewDataBinding, VM : BaseViewModel>() : AppCompatActivity() {

    lateinit var mBinding: T

    abstract val mViewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, bindLayoutId())
        //setContentView(mBinding.root)

        initViews()
    }

    protected abstract fun bindLayoutId(): Int

    protected abstract fun initViews()
}