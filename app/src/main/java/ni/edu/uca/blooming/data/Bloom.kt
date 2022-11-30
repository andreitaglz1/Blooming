package ni.edu.uca.blooming.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_bloom")
data class Bloom(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "bloomText") val bloomText: String?,
    @ColumnInfo(name = "date") val date: String?
)
