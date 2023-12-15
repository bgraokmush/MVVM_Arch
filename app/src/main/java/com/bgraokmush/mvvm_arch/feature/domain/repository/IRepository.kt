package com.bgraokmush.mvvm_arch.feature.domain.repository

import com.bgraokmush.mvvm_arch.feature.domain.model.User

interface IRepository {
    suspend fun getData() : List<User>
}