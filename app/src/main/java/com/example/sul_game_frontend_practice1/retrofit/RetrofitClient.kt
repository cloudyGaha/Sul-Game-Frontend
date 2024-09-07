
//import android.util.Log
//import okhttp3.OkHttpClient
//import okhttp3.logging.HttpLoggingInterceptor
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import java.util.concurrent.TimeUnit
//
//object RetrofitClient {
//    private const val BASE_URL = "http://220.85.169.165:8085/"
//
//    private fun createOkHttpClient(): OkHttpClient {
//        val interceptor = HttpLoggingInterceptor()
//        interceptor.level = HttpLoggingInterceptor.Level.BODY               //okhttp에서 어떤부분을 로깅할지 지정
//
//
//        return OkHttpClient.Builder()
//            .addInterceptor { chain ->
//                val original = chain.request()
//                val requestBuilder = original.newBuilder()                      // 리퀘스트 빌더 만들고
//                    .header("Authorization", "KakaoAK ${BuildConfig.KAKAO_API_KEY}")    // 거기에 헤더 추가
//                val request = requestBuilder.build()
//                chain.proceed(request)
//            }
//            .connectTimeout(20, TimeUnit.SECONDS)
//            .readTimeout(20, TimeUnit.SECONDS)
//            .writeTimeout(20, TimeUnit.SECONDS)             //타임아웃 조건 추가
//            .addNetworkInterceptor(interceptor)                     //로그용 okhttp 달아주고
//            .build()
//    }
//
//    private val retrofit: Retrofit = Retrofit.Builder()
//        .baseUrl(BASE_URL)                              // baseurl 달고
//        .addConverterFactory(GsonConverterFactory.create())     // json을 data class로 편하게 바꿔주는 gson
//        .client(createOkHttpClient())               // okhttp 클라이언트 달고
//        .build()
//
//    val API: API = retrofit.create(API::class.java)
//}
package com.example.sul_game_frontend_practice1.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://api.sul-game.info/api/"
    private var retrofit: Retrofit? = null

    fun getClient(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
}

