package net.davrukin.apps.jobapplicationtracker.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import io.reactivex.Flowable
import net.davrukin.apps.jobapplicationtracker.models.User

@Dao
interface UserDao {

    @Query("SELECT * FROM User")
    fun getUser(): Flowable<User>

}