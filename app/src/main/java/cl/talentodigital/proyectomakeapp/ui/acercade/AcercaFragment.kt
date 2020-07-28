package cl.talentodigital.proyectomakeapp.ui.acercade

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cl.talentodigital.proyectomakeapp.R
import cl.talentodigital.proyectomakeapp.ui.cabello.CabelloViewModel

class AcercaFragment: Fragment() {

    private lateinit var acercaViewModel: AcercaViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        acercaViewModel =
            ViewModelProviders.of(this).get( AcercaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_acerca, container, false)
        val textView: TextView = root.findViewById(R.id.text_acerca)
        acercaViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}