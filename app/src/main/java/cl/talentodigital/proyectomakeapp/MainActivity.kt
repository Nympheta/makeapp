package cl.talentodigital.proyectomakeapp

import MakeUp
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Menu
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import cl.talentodigital.proyectomakeapp.adapters.MaquillajeAdapter
import cl.talentodigital.proyectomakeapp.interfaces.IComunicaFragments
import cl.talentodigital.proyectomakeapp.ui.accesorios.AccesoriosFragment

import cl.talentodigital.proyectomakeapp.ui.cabello.CabelloFragment
import cl.talentodigital.proyectomakeapp.ui.favoritos.FavoritosFragment
import cl.talentodigital.proyectomakeapp.ui.maquillaje.Maquillaje
import cl.talentodigital.proyectomakeapp.ui.maquillaje.MaquillajeFragment
import cl.talentodigital.proyectomakeapp.ui.skincare.SkinCareFragment
import cl.talentodigital.proyectomakeapp.ui.tutoriales.TutorialesFragment
import cl.talentodigital.proyectomakeapp.utils.MakeupRetrofit
import kotlinx.android.synthetic.main.activity_splach.*
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList

class MainActivity : AppCompatActivity()  {

    private lateinit var appBarConfiguration: AppBarConfiguration



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show() }


        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,R.id.nav_acc,R.id.nav_tuto,R.id.nav_cabello,
        R.id.nav_fav,R.id.nav_acerca), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    fun clickMaq(view: View){
        val fragment: Fragment = MaquillajeFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction =
            fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_host_fragment, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    fun clickSkin(view: View){
        val fragment: Fragment = SkinCareFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction =
            fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_host_fragment, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    fun clickAcc(view: View){
        val fragment: Fragment = AccesoriosFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction =
            fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_host_fragment, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }


    fun clickTuto(view: View){
        val fragment: Fragment = TutorialesFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction =
            fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_host_fragment, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    fun clickHair(view: View){
        val fragment: Fragment = CabelloFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction =
            fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_host_fragment, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    fun clickFav(view: View){
        val fragment: Fragment = FavoritosFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction =
            fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_host_fragment, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }


}