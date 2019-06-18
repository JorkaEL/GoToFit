package boutanquoy.xavier.com.gotofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import boutanquoy.xavier.com.gotofit.adapter.FitPagerAdapter

import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        configureTabLayout()
    }

    private fun configureTabLayout() {

        tab_layout.addTab(tab_layout.newTab().setText(R.string.fragment_calendar))
        tab_layout.addTab(tab_layout.newTab().setText(R.string.fragment_chart))
        tab_layout.addTab(tab_layout.newTab().setText(R.string.fragment_measurement))

        val adapter = FitPagerAdapter(supportFragmentManager, tab_layout.tabCount)
        pager.adapter = adapter

        pager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(tab_layout))
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
