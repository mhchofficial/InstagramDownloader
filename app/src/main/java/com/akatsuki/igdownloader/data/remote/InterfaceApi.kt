package com.akatsuki.igdownloader.data.remote


import com.akatsuki.igdownloader.data.model.ReelResponse.ReelResponse
import com.akatsuki.igdownloader.data.model.Story.storyv2.Story2Response
import com.akatsuki.igdownloader.data.model.TvResponse.IgTvResponse
import com.akatsuki.igdownloader.data.model.mediaid_bumsun.MediaIdResponse
import com.akatsuki.igdownloader.data.model.profile.ProfileResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface InterfaceApi {
    @GET("/api/v1/users/{uid}/info/")
    suspend fun getProfile(
        @Path("uid") uid: String,
        @Header("user-agent") agent: String,
        @Header("cookie") cookie: String,
        @Header("content-type") content: String
    ): Response<ProfileResponse>

    @GET
    suspend fun getMediaId(
        @Url url: String,
    ): Response<MediaIdResponse>


    @Headers(
        "user-agent: Instagram 136.0.0.34.124 (Linux; Android 9.0; ANE-LX1 Build/HUAWEIANE-LX1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.109 Mobile Safari/537.36",
        "content-type: application/json"
    )
    @GET("/api/v1/media/{mid}/info/")
    suspend fun getIgtv(
        @Path("mid") mid: String,
        @Header("cookie") cookie: String,
    ): Response<IgTvResponse>



    @Headers(
        "user-agent: Instagram 136.0.0.34.124 (Linux; Android 9.0; ANE-LX1 Build/HUAWEIANE-LX1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.109 Mobile Safari/537.36",
        "content-type: application/json"
    )
    @GET("/api/v1/media/{mid}/info/")
    suspend fun getReel(
        @Path("mid") mid: String,
        @Header("cookie") cookie: String,
    ): Response<ReelResponse>


    @Headers(
        "user-agent: Instagram 136.0.0.34.124 (Linux; Android 9.0; ANE-LX1 Build/HUAWEIANE-LX1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.109 Mobile Safari/537.36",
        "content-type: application/json"
    )
    @GET("/api/v1/media/{mid}/info/")
    suspend fun getPost(
        @Path("mid") mid: String,
        @Header("cookie") cookie: String,
    ): Response<Any>


    @Headers(
        "user-agent: Instagram 136.0.0.34.124 (Linux; Android 9.0; ANE-LX1 Build/HUAWEIANE-LX1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.109 Mobile Safari/537.36",
        "content-type: application/json"
    )
    @GET
    suspend fun getPrivatePost(
        @Url url: String,
        @Header("cookie") cookie: String,
    ): Response<Any>





    //get Story media info
    @Headers(
        "user-agent: Instagram 136.0.0.34.124 (Linux; Android 9.0; ANE-LX1 Build/HUAWEIANE-LX1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.109 Mobile Safari/537.36",
        "content-type: application/json"
    )
    @GET("/api/v1/feed/user/{userid}/story/")
    suspend fun getstory(
        @Path("userid") userid: String,
        @Header("cookie") cookie: String
    ): Response<Story2Response>


    //get uid form usesrs
    @Headers(
        "user-agent: Instagram 136.0.0.34.124 (Linux; Android 9.0; ANE-LX1 Build/HUAWEIANE-LX1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.109 Mobile Safari/537.36",
        "content-type: application/json"
    )
    @GET("/api/v1/users/web_profile_info/")
    fun getuid(
        @Query("username") user: String?,
        @Header("cookie") cookie: String?
    ): Call<ResponseBody?>?


}