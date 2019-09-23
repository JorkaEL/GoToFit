package boutanquoy.xavier.com.gotofit.measurement.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import boutanquoy.xavier.com.gotofit.R

class MeasurementAdapter(private val dataMeasurement: List<String>): RecyclerView.Adapter<MeasurementAdapter.ItemViewHolder>() {

    class ItemViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.textView.text = dataMeasurement[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val textView = LayoutInflater.from(parent.context).inflate(R.layout.item_measurement, parent, false) as TextView

        return ItemViewHolder(
            textView
        )
    }

    override fun getItemCount(): Int {
        return dataMeasurement.size
    }

}