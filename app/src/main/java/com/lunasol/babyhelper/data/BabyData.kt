package com.lunasol.babyhelper.data

import java.util.Date

enum class SEX(val title: String)
{
    MALE("MALE"),
    FEMALE("FEMALE"),
    UNKNOWN("UNKNOWN")
}

data class BabyData(val firstName: String, val lastName: String, val age: Int, val gender: SEX = SEX.UNKNOWN, val birthDate: Date)