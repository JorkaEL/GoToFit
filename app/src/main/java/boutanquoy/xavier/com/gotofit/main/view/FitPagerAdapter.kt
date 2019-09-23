package boutanquoy.xavier.com.gotofit.main.view

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import boutanquoy.xavier.com.gotofit.calendar.view.CalendarFragment
import boutanquoy.xavier.com.gotofit.graph.view.GraphFragment
import boutanquoy.xavier.com.gotofit.measurement.view.MeasurementFragment

class FitPagerAdapter(fm: FragmentManager, private var tabCount: Int) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> MeasurementFragment()
            1 -> GraphFragment()
            2 -> CalendarFragment()
            else -> null
        }
    }

    override fun getCount(): Int {
        return tabCount
    }

}
