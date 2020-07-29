package cl.talentodigital.proyectomakeapp.ui.accesorios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cl.talentodigital.proyectomakeapp.R

class AccesoriosFragment : Fragment() {

    private lateinit var accesoriosViewModel: AccesoriosViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        accesoriosViewModel =
            ViewModelProviders.of(this).get(AccesoriosViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_accesorios, container, false)

        return root
    }

}