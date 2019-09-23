package boutanquoy.xavier.com.gotofit.measurement.presenter

import android.arch.lifecycle.Observer
import android.support.v7.widget.LinearLayoutManager
import boutanquoy.xavier.com.gotofit.measurement.interactor.MeasurementInteractor
import boutanquoy.xavier.com.gotofit.measurement.interactor.MeasurementInteractorImpl
import boutanquoy.xavier.com.gotofit.measurement.view.MeasurementAdapter
import boutanquoy.xavier.com.gotofit.measurement.view.MeasurementFragment
import kotlinx.android.synthetic.main.fragment_measurement.*

interface MeasurementPresenter {
    fun initPresenter()
    fun initRecyclerView()
}

class MeasurementPresenterImpl(val view: MeasurementFragment) : MeasurementPresenter,
    MeasurementInteractor {

    private lateinit var itemMeasurement: MutableList<String>
    private lateinit var measurementAdapter: MeasurementAdapter
    private val interactor: MeasurementInteractorImpl = MeasurementInteractorImpl().apply {
        listener = this@MeasurementPresenterImpl
    }


    override fun initPresenter() {
        initRecyclerView()
        initInteractorState()
        getListMeasurement()
    }

    override fun getListMeasurement() {
        interactor.getListMeasurement()
    }

    private fun initInteractorState() {
        interactor.state.observe(view, Observer { newState ->
            if (newState != null) {
                if (newState.listMeasurement.isNotEmpty()) dataChange(newState.listMeasurement)
            }
        })
    }

    override fun initRecyclerView() {
        itemMeasurement = mutableListOf()
        view.context?.let { measurementAdapter = MeasurementAdapter(itemMeasurement) }
        // Init Recycler view with view root and adapter
        view.measurementView.apply {
            setHasFixedSize(true)
            isNestedScrollingEnabled = false
            layoutManager = LinearLayoutManager(context)
            adapter = measurementAdapter
        }
    }

    private fun dataChange(list: List<String>){
        itemMeasurement.clear()
        itemMeasurement.addAll(list)
        measurementAdapter.notifyDataSetChanged()
    }

}