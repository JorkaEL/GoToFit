package boutanquoy.xavier.com.gotofit.measurement.view

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import boutanquoy.xavier.com.gotofit.AddMeasurementActivity

import boutanquoy.xavier.com.gotofit.R
import kotlinx.android.synthetic.main.fragment_measurement.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [MeasurementFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [MeasurementFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class MeasurementFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_measurement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab.setOnClickListener { view ->
            val intent = Intent(context, AddMeasurementActivity::class.java)
            startActivity(intent)
            //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //.setAction("Action", null).show()
        }

        measurementView.apply {
            setHasFixedSize(true)
            isNestedScrollingEnabled = false
            layoutManager = LinearLayoutManager(context)
            adapter = MeasurementAdapter(
                arrayListOf(
                    "test1",
                    "test2"
                )
            )
        }
    }
}
