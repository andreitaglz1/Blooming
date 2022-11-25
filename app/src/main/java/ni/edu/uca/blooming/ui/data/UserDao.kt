package ni.edu.uca.blooming.ui.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun registrarUser(user: User)

    @Query ("SELECT * FROM tbl_user ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>

    @Query("SELECT * FROM tbl_user WHERE username LIKE :userName and password LIKE :pwd")
    suspend fun getUser(userName: String, pwd: String): User?
}