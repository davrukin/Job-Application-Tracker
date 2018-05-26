package net.davrukin.apps.jobapplicationtracker.models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey var name: String,
    @ColumnInfo(name = "applications") var applications: ArrayList<JobApplication>
) {
    companion object {

    }
}