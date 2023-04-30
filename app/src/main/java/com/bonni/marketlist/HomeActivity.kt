package com.bonni.marketlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.bonni.marketlist.presentation.HomeFragment

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpToolbar()
        val fragment = HomeFragment()
            replaceFragment(fragment)
    }

    private fun setUpToolbar() {
        val toolbar: Toolbar = findViewById(R.id.homeToolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Lista de Mercado"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun replaceFragment(fragment: HomeFragment) {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }
}