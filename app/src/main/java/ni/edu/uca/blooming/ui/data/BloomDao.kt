package ni.edu.uca.blooming.ui.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface BloomDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(bloom: Bloom)

    @Delete
    suspend fun delete(bloom : Bloom)

    @Query("SELECT * from tbl_bloom order by id ASC")
    fun getAllBlooms() : LiveData<List<Bloom>>

    @Query("UPDATE tbl_bloom set bloomText = :bloomText WHERE id = :id")
    suspend fun update(id : Int?, bloomText : String?)
}