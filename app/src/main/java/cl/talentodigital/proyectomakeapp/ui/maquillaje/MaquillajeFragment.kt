package cl.talentodigital.proyectomakeapp.ui.maquillaje

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

        cargarlista()

        return root
    }

    fun cargarlista(){

        listaMaquillaje!!.add(Maquillaje
            ("Las Mejores Paletas del 2020",
            "Encuentra aqui las paletas más vendidas del año y donde poder adquirirlas",R.drawable.paletas1))
        listaMaquillaje!!.add(Maquillaje("¡Estos tonos de labiales te encantarán!",
            "Revisa los labiales y tonos que son tendencia en este año",R.drawable.labial))


    }

    private fun mostrarData(){
        recyclerViewMaquillaje!!.layoutManager =LinearLayoutManager(context)


    }
}