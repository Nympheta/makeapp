package cl.talentodigital.proyectomakeapp.room

import Makeup_colors
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lipstick_list")
data class LipStick (@ColumnInfo(name = "id")
                     @PrimaryKey(autoGenerate = true)
                     val id : Int,
                     val brand : String,
                     val name : String,
                     val price : Double,
                     val price_sign : String,
                     val currency : String,
                     val image_link : String,
                     val product_link : String,
                     val website_link : String,
                     val description : String,
                     val rating : String,
                     val category : String,
                     val product_type : String,
                     val tag_list : List<String>,
                     val created_at : String,
                     val updated_at : String,
                     val product_api_url : String,
                     val api_featured_image : String,
                     val product_colors : List<Makeup_colors> )
