package cl.talentodigital.proyectomakeapp.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MakeupRetrofit {
    companion object {
        private const val BASE_URL = "http://makeup-api.herokuapp.com/api/v1/products.json"

        fun retrofitInstance(): Api {

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            val Apis : Api = retrofit.create(Api::class.java)
            return Apis
        }
    }
}