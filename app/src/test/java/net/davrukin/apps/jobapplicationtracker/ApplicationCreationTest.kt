package net.davrukin.apps.jobapplicationtracker

import net.davrukin.apps.jobapplicationtracker.models.ApplicationStatus
import net.davrukin.apps.jobapplicationtracker.models.JobApplication
import net.davrukin.apps.jobapplicationtracker.models.Offer
import net.davrukin.apps.jobapplicationtracker.models.User
import org.junit.Test
import org.junit.Assert.*

class ApplicationCreationTest {

    @Test
    fun testJobApplication() {
        var user = User("Daniel Avrukin", ArrayList<JobApplication>())
        var app = JobApplication("ThinkWork", "Individual", ApplicationStatus.APPLIED, Offer(false))
        assertEquals(app.status, ApplicationStatus.APPLIED)
    }
}