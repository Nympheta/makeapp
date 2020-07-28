package cl.talentodigital.proyectomakeapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [(Eyeshadow:: class)], version = 1)


abstract class MakeupDataBase : RoomDatabase(){
    abstract fun getMakeupDao(): MakeupDAO
    companion object {
        @Volatile
        private var INSTANCE: MakeupDataBase? = null

        fun getDatabase(context: Context): MakeupDataBase{
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,MakeupDataBase::class.java,"eyeshadow_database").build()
                INSTANCE = instance
                return instance
            }
        }
    }


}