package com.bgraokmush.mvvm_arch.feature.data.repository

import com.bgraokmush.mvvm_arch.feature.data.mapper.toUser
import com.bgraokmush.mvvm_arch.feature.data.remote.Api
import com.bgraokmush.mvvm_arch.feature.domain.model.User
import com.bgraokmush.mvvm_arch.feature.domain.repository.IRepository

class RepoImplementation(
    val api : Api
) : IRepository {
    override suspend fun getData(): List<User> {
        return api.getData().map{ it.toUser()}
    }

}