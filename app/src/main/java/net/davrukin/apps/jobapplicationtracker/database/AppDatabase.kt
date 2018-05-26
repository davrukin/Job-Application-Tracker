package net.davrukin.apps.jobapplicationtracker.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import net.davrukin.apps.jobapplicationtracker.models.User

@Database(entities = {User::class.java}, version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract var userDao: UserDao
}