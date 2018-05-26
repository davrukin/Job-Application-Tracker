package net.davrukin.apps.jobapplicationtracker.models

data class Offer(var given: Boolean) { // given is primary constructor, add others later
    var hours: Int = 0 // full-time, part-time
    var payFrequency: Int = 0 // hourly, salary
    var pay: Long = 0
    var benefits: String = ""
    var counterOffer: Boolean = false
}

