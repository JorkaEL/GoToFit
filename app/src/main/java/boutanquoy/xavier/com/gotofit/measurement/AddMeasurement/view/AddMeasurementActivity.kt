package boutanquoy.xavier.com.gotofit.measurement.AddMeasurement.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import boutanquoy.xavier.com.gotofit.R
import kotlinx.android.synthetic.main.activity_add_measurement.*

class AddMeasurementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_measurement)
        setSupportActionBar(toolbar)


        val actionbar = supportActionBar
        actionbar?.title = "ADD Measurement"
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
