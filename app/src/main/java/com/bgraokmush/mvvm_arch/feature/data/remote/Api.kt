package com.bgraokmush.mvvm_arch.feature.data.remote

interface Api{
    fun getData() : List<UserDto>
}