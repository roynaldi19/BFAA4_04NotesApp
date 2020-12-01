package com.roynaldi19.bfaa4_04notesapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Note(
        var id: Int = 0,
        var title: String? = null,
        var description: String? = null,
        var date: String? = null
) : Parcelable