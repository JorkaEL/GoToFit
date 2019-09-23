package boutanquoy.xavier.com.gotofit.main.view

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import boutanquoy.xavier.com.gotofit.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configureTabLayout()
    }

    private fun configureTabLayout() {

        tab_layout.addTab(tab_layout.newTab().setText(R.string.fragment_measurement))
        tab_layout.addTab(tab_layout.newTab().setText(R.string.fragment_chart))
        tab_layout.addTab(tab_layout.newTab().setText(R.string.fragment_calendar))

        val adapter = FitPagerAdapter(
            supportFragmentManager,
            tab_layout.tabCount
        )
        pager.adapter = adapter

        pager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(tab_layout)
        )
        tab_layout.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                pager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }

        })
    }
}
