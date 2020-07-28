package cl.talentodigital.proyectomakeapp.ui.cabello

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cl.talentodigital.proyectomakeapp.R
import cl.talentodigital.proyectomakeapp.ui.tutoriales.TutorialesViewModel

class CabelloFragment: Fragment() {

    private lateinit var cabelloViewModel: CabelloViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cabelloViewModel =
            ViewModelProviders.of(this).get(CabelloViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_cabello, container, false)
        val textView: TextView = root.findViewById(R.id.text_hair)
        cabelloViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}