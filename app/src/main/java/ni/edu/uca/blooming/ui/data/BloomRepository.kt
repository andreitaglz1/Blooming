package ni.edu.uca.blooming.ui.data

import androidx.lifecycle.LiveData

class BloomRepository(private val bloomDao: BloomDao) {

    val allBlooms : LiveData<List<Bloom>> = bloomDao.getAllBlooms()

    suspend fun insert(bloom: Bloom){
        bloomDao.insert(bloom)
    }

    suspend fun delete(bloom: Bloom){
        bloomDao.delete(bloom)
    }

    suspend fun update(bloom: Bloom){
        bloomDao.update(bloom.id,bloom.bloomText)
    }
}