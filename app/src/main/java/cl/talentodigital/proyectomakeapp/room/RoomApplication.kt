package cl.talentodigital.proyectomakeapp.room

import android.app.Application
import androidx.room.Room

class RoomApplication : Application() {
    companion object{
        var makeupDataBase: MakeupDataBase? = null
    }

    override fun onCreate(){
        super.onCreate()
        makeupDataBase = Room.databaseBuilder(this,MakeupDataBase :: class.java,"recommendations-master-db").build()
    }

}