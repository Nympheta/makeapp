package cl.talentodigital.proyectomakeapp.ui.tutoriales

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cl.talentodigital.proyectomakeapp.R
import cl.talentodigital.proyectomakeapp.ui.skincare.SkinCareViewModel

class TutorialesFragment : Fragment() {

    private lateinit var tutorialesViewModel: TutorialesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tutorialesViewModel =
            ViewModelProviders.of(this).get(TutorialesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tutoriales, container, false)
        val textView: TextView = root.findViewById(R.id.text_tuto)
        tutorialesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}