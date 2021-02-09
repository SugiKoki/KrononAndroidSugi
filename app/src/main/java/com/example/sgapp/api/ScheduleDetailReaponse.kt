package com.example.sgapp.api

import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat

class ScheduleDetailReaponse(
    @SerializedName("success")
    val success: Boolean?,
    @SerializedName("code")
    val code: Int?,
    @SerializedName("data")
    var data: DetailSchedule
)

class DetailSchedule(
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("schedule_date")
    var schedule_date: String? = null,
    @SerializedName("place")
    var place: Int? = null,
    @SerializedName("start_time")
    var start_time: String? = null,
    @SerializedName("end_time")
    var end_time: String? = null,
    @SerializedName("content")
    var content: String? = null
)