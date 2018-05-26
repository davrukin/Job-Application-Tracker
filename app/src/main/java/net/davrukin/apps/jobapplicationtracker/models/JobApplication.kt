package net.davrukin.apps.jobapplicationtracker.models

/**
 * Enter company as string, position as string, application status as enum, and offer as enum
 */
data class JobApplication(
    var company: String,
    var position: String,
    var status: ApplicationStatus, // enum
    var offer: Offer
)