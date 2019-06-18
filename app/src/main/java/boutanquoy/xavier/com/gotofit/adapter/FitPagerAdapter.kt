package boutanquoy.xavier.com.gotofit.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import boutanquoy.xavier.com.gotofit.fragment.CalendarFragment
import boutanquoy.xavier.com.gotofit.fragment.GraphFragment
import boutanquoy.xavier.com.gotofit.fragment.MeasurementFragment

class FitPagerAdapter(fm : FragmentManager, private var tabCount: Int) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
         when (position) {
            0 -> return MeasurementFragment()
            1 ->  return GraphFragment()
            2 -> return CalendarFragment()
             else -> return null
        }
    }

    override fun getCount(): Int {
        return tabCount
    }

}
