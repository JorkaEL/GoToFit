package boutanquoy.xavier.com.gotofit.graph.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import boutanquoy.xavier.com.gotofit.R
import boutanquoy.xavier.com.gotofit.graph.presenter.GraphPresenterImpl

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [GraphFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [GraphFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class GraphFragment : Fragment() {

    private lateinit var presenter: GraphPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter = GraphPresenterImpl(this)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_graph, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.initPresenter()
    }

}
