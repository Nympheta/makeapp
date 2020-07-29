package cl.talentodigital.proyectomakeapp.ui.maquillaje

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cl.talentodigital.proyectomakeapp.R
import cl.talentodigital.proyectomakeapp.adapters.MaquillajeAdapter
import cl.talentodigital.proyectomakeapp.interfaces.IComunicaFragments
import kotlinx.android.synthetic.main.fragment_home.*

class MaquillajeFragment : Fragment()   {

    var maquillajeAdapter : MaquillajeAdapter? = null
    var recyclerViewMaquillaje :RecyclerView? = null
    var listaMaquillaje: ArrayList <Maquillaje>? = null
    var actividad: Activity? = null
    var interfaceIComunicaFragments : IComunicaFragments ? = null

    private lateinit var maquillajeViewModel: MaquillajeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        maquillajeViewModel =
                ViewModelProviders.of(this).get(MaquillajeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_maquillaje, container, false)



        recyclerViewMaquillaje = root.findViewById(R.id.recyclermaq)
        listaMaquillaje = ArrayList()


        return root
    }

}