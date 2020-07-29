package cl.talentodigital.proyectomakeapp.ui.skincare

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cl.talentodigital.proyectomakeapp.R

class SkinCareFragment : Fragment() {

    private lateinit var skinCareViewModel: SkinCareViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        skinCareViewModel =
                ViewModelProviders.of(this).get(SkinCareViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_skincare, container, false)

        return root
    }
}