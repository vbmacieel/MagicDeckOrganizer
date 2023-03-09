package com.example.magicdeckorganizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.example.magicdeckorganizer.fragments.CardsFragment
import com.example.magicdeckorganizer.fragments.DecksFragment

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentContainer: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragment()
    }

    private fun setFragment() {
        fragmentContainer = findViewById(R.id.fragment_container)
        val supportFragmentManager = supportFragmentManager
        var fragment: Fragment? = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (fragment == null) {
            fragment = CardsFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
    }
}