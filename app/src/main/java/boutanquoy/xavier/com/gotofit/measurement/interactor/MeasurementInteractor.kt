package boutanquoy.xavier.com.gotofit.measurement.interactor

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

interface MeasurementInteractor {
    fun getListMeasurement()
}

class MeasurementInteractorImpl : ViewModel(), MeasurementInteractor {

    var listener: MeasurementInteractor? = null
    var state = MutableLiveData<MeasurementState>()


    override fun getListMeasurement() {
        val listString = listOf("test1", "test2", "test3", "test4")
        state.postValue(MeasurementState(listMeasurement = listString))
    }
}