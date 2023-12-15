package com.bgraokmush.mvvm_arch.feature.data.mapper

import com.bgraokmush.mvvm_arch.feature.data.remote.UserDto
import com.bgraokmush.mvvm_arch.feature.domain.model.User


fun UserDto.toUser() : User{
    return User(
        name = name ?: "John"
    )
}