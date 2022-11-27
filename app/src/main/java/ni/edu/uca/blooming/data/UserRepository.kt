package ni.edu.uca.blooming.data

import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun registrarUser(user: User){
        userDao.registrarUser(user)
    }
}