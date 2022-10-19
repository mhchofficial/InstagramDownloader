package com.akatsuki.igdownloader.repository

import android.content.Context
import android.util.Log
import com.akatsuki.igdownloader.data.model.ReelResponse.ReelResponse
import com.akatsuki.igdownloader.data.model.Story.storyv2.Story2Response
import com.akatsuki.igdownloader.data.model.TvResponse.IgTvResponse
import com.akatsuki.igdownloader.data.model.mediaid_bumsun.MediaIdResponse
import com.akatsuki.igdownloader.data.model.profile.User
import com.akatsuki.igdownloader.data.remote.InterfaceApi

import com.akatsuki.igdownloader.utils.Base.USERAGENT
import com.akatsuki.igdownloader.utils.Base.content_type
import com.akatsuki.igdownloader.utils.Resource
import com.akatsuki.igdownloader.utils.Resource.*
import javax.inject.Inject

class DataRepository @Inject constructor(
    private val api: InterfaceApi,
) {


    //remote







    //get user data from web
    suspend fun getProfile(uid: String, cookie: String): Resource<User> {
        val response = try {
            api.getProfile(
                uid,
                USERAGENT,
                cookie,
                content_type
            ).body()?.user

        } catch (e: Exception) {
            return Error("An unknown error occurred.")
        }
        return Success(response!!)
    }

    //et media id
    suspend fun getmediaid(url: String, ctx: Context): Resource<MediaIdResponse> {
        val response = try {
            api.getMediaId(
                url
            )
            .body()


        } catch (e: Exception) {
            Log.e("connection", "is pure")
            return Error("An unknown error occurred.")
        }
        return Success(response!!)
    }


    //get download link form igtv
    suspend fun getIgtv_download(mediaid: String, cookie: String): Resource<IgTvResponse> {
        val response = try {
            api.getIgtv(
                mid = mediaid,
                cookie = cookie
            ).body()

        } catch (e: Exception) {
            return Error("An unknown error occurred.")
        }
        return Success(response!!)
    }

    suspend fun getReel_download(mediaid: String, cookie: String): Resource<ReelResponse> {
        val response = try {
            api.getReel(
                mid = mediaid,
                cookie = cookie
            ).body()

        } catch (e: Exception) {
            return Error("An unknown error occurred.")
        }
        return Success(response!!)
    }

    suspend fun getPost_download(mediaid: String, cookie: String): Resource<Any> {
        val response = try {
            api.getPost(
                mid = mediaid,
                cookie = cookie
            ).body()

        } catch (e: Exception) {
            return Error("An unknown error occurred.")
        }
        return Success(response!!)
    }


    suspend fun getPrivate_download(url: String, cookie: String, ctx: Context): Resource<Any> {
        var res : Any = ""
        val response = try {
            val a = api.getPrivatePost(
                url = url,
                cookie = cookie
            )

            if (a.code() == 200){
                res = a.body()!!
            }
            else{
                res = "blank"
            }


        } catch (e: Exception) {
            Log.e("connection", "is pure")
            return Error("An unknown error occurred.")
        }
        return Success(res!!)
    }

    suspend fun getStory_download(userid: String, cookie: String): Resource<Story2Response> {
        val response = try {
            api.getstory(
                userid = userid,
                cookie = cookie
            ).body()

        } catch (e: Exception) {
            return Error("An unknown error occurred.")
        }
        return Success(response!!)
    }

}