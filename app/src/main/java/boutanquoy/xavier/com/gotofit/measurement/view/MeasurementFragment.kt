package boutanquoy.xavier.com.gotofit.measurement.view

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import boutanquoy.xavier.com.gotofit.measurement.AddMeasurement.view.AddMeasurementActivity

import boutanquoy.xavier.com.gotofit.R
import boutanquoy.xavier.com.gotofit.measurement.presenter.MeasurementPresenterImpl
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
    private lateinit var presenter: MeasurementPresenterImpl

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter = MeasurementPresenterImpl(this)
        return inflater.inflate(R.layout.fragment_measurement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab.setOnClickListener {
            val intent = Intent(context, AddMeasurementActivity::class.java)
            startActivity(intent)
            //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //.setAction("Action", null).show()
        }

        presenter.initPresenter()
    }
}
