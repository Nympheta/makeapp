package cl.talentodigital.proyectomakeapp.adapters

import MakeUp
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.ArrayList
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cl.talentodigital.proyectomakeapp.R
import cl.talentodigital.proyectomakeapp.room.Eyeshadow
import cl.talentodigital.proyectomakeapp.ui.maquillaje.Maquillaje
import com.squareup.picasso.Picasso

class MaquillajeAdapter (val data: ArrayList<Maquillaje>) : RecyclerView.Adapter<MaquillajeAdapter.CustomViewHolder>(){

    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mTitle: TextView = itemView.findViewById(R.id.txt_maq)
        val mImgPost: ImageView = itemView.findViewById(R.id.imageView)
        val mDesc : TextView = itemView.findViewById(R.id.des_maq)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_maquillaje, parent, false)
        return CustomViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.mTitle.text = data[position].titulo
        holder.mDesc.text = data[position].descripcion

        val img1 = data[position].imagen

        Picasso.get()
            .load(img1)
            .into(holder.mImgPost)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

