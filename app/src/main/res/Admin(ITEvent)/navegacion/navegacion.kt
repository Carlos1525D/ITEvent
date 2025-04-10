package com.itevent.app.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.itevent.app.databinding.ActivityHomeBinding
import com.itevent.app.fragments.AgendaFragment
import com.itevent.app.fragments.EventsFragment
import com.itevent.app.fragments.UsersFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(EventsFragment())

        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_events -> loadFragment(EventsFragment())
                R.id.nav_agenda -> loadFragment(AgendaFragment())
                R.id.nav_users -> loadFragment(UsersFragment())
            }
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id, fragment)
            .commit()
    }
}
