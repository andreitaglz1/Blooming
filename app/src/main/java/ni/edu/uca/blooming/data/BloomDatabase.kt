package ni.edu.uca.blooming.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Bloom::class), version = 1, exportSchema = false)
abstract class BloomDatabase : RoomDatabase() {

    abstract fun getBloomDao() : BloomDao

    companion object {

        @Volatile
        private var INSTANCE : BloomDatabase? = null

        fun getDatabase(context: Context) : BloomDatabase {

            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BloomDatabase::class.java,
                    "bloom_database"
                ).build()

                INSTANCE = instance

                instance

            }
        }

    }

}