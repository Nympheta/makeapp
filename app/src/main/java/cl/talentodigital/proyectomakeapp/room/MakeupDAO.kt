package cl.talentodigital.proyectomakeapp.room

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface MakeupDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMakeupItem(superHeroEntity:  Eyeshadow)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(heroes: List< Eyeshadow>)

    @Insert
    suspend fun updateMakeupItem(superHeroEntity:  Eyeshadow)

    @Delete
    fun clearAllMakeupItem(vararg creature: Eyeshadow)

    @Query("SELECT * FROM eyeshadow_list")
    fun getAllMakeupItem(): LiveData<List<Eyeshadow>>
}