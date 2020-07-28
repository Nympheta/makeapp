package cl.talentodigital.proyectomakeapp.ui.blog

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

class BlogFragment : Fragment() {

    private lateinit var blogViewModel: BlogViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        blogViewModel =
            ViewModelProviders.of(this).get(blogViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_blog, container, false)
        val textView: TextView = root.findViewById(R.id.text_blog)
        blogViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
