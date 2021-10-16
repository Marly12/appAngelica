package com.example.appangelica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appangelica.fragment.Adapter.ViewPagerAdapter
import com.example.appangelica.fragment.FavouriteFragment
import com.example.appangelica.fragment.HomeFragment
import com.example.appangelica.fragment.SettingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpTbas()


    }

    private fun setUpTbas(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(),"HOME")
        adapter.addFragment(FavouriteFragment(),"FAVOURITES")
        adapter.addFragment(SettingFragment(),"SETTINGS")
        viewPger.adapter = adapter
        tabs.setupWithViewPager(viewPger)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_favorite_border_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_settings_24)




    }


}