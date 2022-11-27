package ni.edu.uca.blooming.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_user")
data class User(
    @PrimaryKey (autoGenerate = true) val id: Int,
    @ColumnInfo val username: String,
    @ColumnInfo val password: String
)
