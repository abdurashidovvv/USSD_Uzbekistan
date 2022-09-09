package com.abdurashidov.ussd_uzbekistan.models

import java.io.Serializable

data class MyInfo(
    val serviceType:Int,
    val name:String,
    val shortInfo:String,
    val narx:String,
    val longInfo:String,
    val code:String
):Serializable