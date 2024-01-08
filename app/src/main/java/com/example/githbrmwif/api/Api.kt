package com.example.githbrmwif.api

import com.example.githbrmwif.data.model.DetailUserResponse
import com.example.githbrmwif.data.model.User
import com.example.githbrmwif.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}