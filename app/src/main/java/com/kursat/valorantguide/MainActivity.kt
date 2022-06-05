package com.kursat.valorantguide

import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.kursat.valorantguide.base.BaseActivity
import com.kursat.valorantguide.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>() {

    override val mViewModel: MainActivityViewModel by viewModels()

    override fun bindLayoutId(): Int = R.layout.activity_main

    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun initViews() {
        setSupportActionBar(mBinding.toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        setupNavigationDrawer()
        setupBottomNavigation()
    }

    private fun setupNavigationDrawer() {
        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, mBinding.drawerLayout, 0, 0)
        mBinding.drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        actionBarDrawerToggle.isDrawerSlideAnimationEnabled = true
        actionBarDrawerToggle.isDrawerIndicatorEnabled = true

        val menuHost: MenuHost = this
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.top_app_bar, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                if (actionBarDrawerToggle.onOptionsItemSelected(menuItem))
                    return true
                return when (menuItem.itemId) {
                    R.id.refresh -> {
                        Toast.makeText(applicationContext, "Clicked Edit", Toast.LENGTH_SHORT)
                            .show()
                        true
                    }
                    else -> false
                }
            }
        })
    }

    private fun setupBottomNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController
        appBarConfiguration =
            AppBarConfiguration(  //appBarConfiguration = AppBarConfiguration(navController.graph,mBinding.drawerLayout)
                setOf(
                    R.id.agentsListFragment
                ), mBinding.drawerLayout
            )
        setupActionBarWithNavController(navController, appBarConfiguration)
        mBinding.bottomNavigation.setupWithNavController(navController)
    }
}