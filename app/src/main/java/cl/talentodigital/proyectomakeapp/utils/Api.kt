package cl.talentodigital.proyectomakeapp.utils

import cl.talentodigital.proyectomakeapp.room.Eyeshadow
import cl.talentodigital.proyectomakeapp.room.LipStick
import retrofit2.Call
import retrofit2.http.GET
import java.util.ArrayList

interface Api {
    @GET("api/v1/products.json?product_category=palette&product_type=eyeshadow/")
    fun getAllEyeshadow(): Call<ArrayList<Eyeshadow>>
    @GET("api/v1/products.json?product_category=lipstick&product_type=lipstick")
    fun getAllLipstick():Call <ArrayList<LipStick>>

}