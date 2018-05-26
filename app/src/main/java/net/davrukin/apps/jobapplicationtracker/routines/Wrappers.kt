package net.davrukin.apps.jobapplicationtracker.routines

import io.reactivex.rxkotlin.toObservable
import net.davrukin.apps.jobapplicationtracker.models.ApplicationStatus
import net.davrukin.apps.jobapplicationtracker.models.JobApplication
import net.davrukin.apps.jobapplicationtracker.models.User

class Wrappers {

    // get user stored in system, don't need to constantly pass it in

    private val user: User ?= null

    init {
        //this.user =

    }

    fun addApplicationToUser(user: User, app: JobApplication) {
        user.applications.add(app)
    }

    fun getApplicationsAppliedTo(user: User): ArrayList<JobApplication> {
        val list = ArrayList<JobApplication>()
        user.applications.toObservable()
            .filter { i ->
                i.status == ApplicationStatus.APPLIED
            }
            .subscribe { i ->
                list.add(i)
            }
        return list
    }

    fun getApplicationsInitialNo(user: User): ArrayList<JobApplication> {
        val list = ArrayList<JobApplication>()
        user.applications.toObservable()
                .filter { i ->
                    i.status == ApplicationStatus.INITIAL_NO
                }
                .subscribe { i ->
                    list.add(i)
                }
        return list
    }

    fun getApplicationsInitialPhoneScreen() {

    }

    fun getApplicationsCodingChallenge() {

    }

    fun getApplicationsOnSite() {

    }

    fun getApplicationsWithOffers() {

    }
}