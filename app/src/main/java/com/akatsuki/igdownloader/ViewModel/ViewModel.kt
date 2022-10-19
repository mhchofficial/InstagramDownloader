package com.akatsuki.igdownloader.ViewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akatsuki.igdownloader.data.model.ReelResponse.ReelResponse
import com.akatsuki.igdownloader.data.model.Story.storyv2.Story2Response
import com.akatsuki.igdownloader.data.model.TvResponse.IgTvResponse
import com.akatsuki.igdownloader.data.model.mediaid_bumsun.MediaIdResponse
import com.akatsuki.igdownloader.data.model.profile.User
import com.akatsuki.igdownloader.repository.DataRepository
import com.akatsuki.igdownloader.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ViewModel @Inject constructor(
    private val repository: DataRepository
) : ViewModel() {

    var _profileData: MutableLiveData<User> = MutableLiveData()
    val profileData: LiveData<User> = _profileData

    fun loadInitData(uid: String, session: String) {

        viewModelScope.launch {
            val newResult = repository.getProfile(uid, session)
            if (newResult is Resource.Success) {
                _profileData.value = newResult.data!!
            }

        }
    }


    var _Mediaiid: MutableLiveData<MediaIdResponse> = MutableLiveData()
    val mediaid: LiveData<MediaIdResponse> = _Mediaiid


    fun loadMediaIdData(Url: String, ctx: Context) {

        viewModelScope.launch {
            val newResult = repository.getmediaid(url = Url, ctx)
            if (newResult is Resource.Success) {
                _Mediaiid.value = newResult.data!!
            }

        }
    }


    var _Igtv: MutableLiveData<IgTvResponse> = MutableLiveData()
    val responseIg: LiveData<IgTvResponse> = _Igtv


    fun loadIgTvData(mediaid: String, session: String) {
        viewModelScope.launch {
            val newResult = repository.getIgtv_download(mediaid = mediaid, cookie = session)
            if (newResult is Resource.Success) {
                _Igtv.value = newResult.data!!
            }

        }
    }


    var _Reel: MutableLiveData<ReelResponse> = MutableLiveData()
    val responseReel: LiveData<ReelResponse> = _Reel

    fun loadReelData(mediaid: String, session: String) {
        viewModelScope.launch {
            val newResult = repository.getReel_download(mediaid = mediaid, cookie = session)
            if (newResult is Resource.Success) {
                _Reel.value = newResult.data!!
            }

        }
    }


    var _Post: MutableLiveData<Any> = MutableLiveData()
    val responsePost: LiveData<Any> = _Post

    fun loadPostData(mediaid: String, session: String) {
        viewModelScope.launch {
            val newResult = repository.getPost_download(mediaid = mediaid, cookie = session)
            if (newResult is Resource.Success) {
                _Post.value = newResult.data!!
            }

        }
    }


    var _Private: MutableLiveData<Any> = MutableLiveData()
    val responsePostPrivate: LiveData<Any> = _Private

    fun loadPrivateData(url: String, session: String, ctx: Context) {
        viewModelScope.launch {
            val newResult = repository.getPrivate_download(url = url, cookie = session, ctx = ctx)
            if (newResult is Resource.Success) {
                _Private.value = newResult.data!!
            }


        }
    }


    var _Story: MutableLiveData<Story2Response> = MutableLiveData()
    val responseStory: LiveData<Story2Response> = _Story

    fun loadStoryData(userid: String, session: String) {
        viewModelScope.launch {
            val newResult = repository.getStory_download(userid = userid, cookie = session)
            if (newResult is Resource.Success) {
                _Story.value = newResult.data!!
            }

        }
    }



}