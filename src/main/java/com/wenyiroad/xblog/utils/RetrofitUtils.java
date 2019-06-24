package com.wenyiroad.xblog.utils;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author xiang.wei
 */
public class RetrofitUtils {

    private static volatile OkHttpClient okHttpClient;

    private static OkHttpClient getOkHttpClient() {
        if (okHttpClient == null) {
            synchronized (RetrofitUtils.class) {
                if (okHttpClient == null) {
                    HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
                    logging.setLevel(HttpLoggingInterceptor.Level.BODY);
                    okHttpClient = new OkHttpClient.Builder()
                            .addInterceptor(logging)
                            .connectionPool(new ConnectionPool(50, 10, TimeUnit.MINUTES))
                            .connectTimeout(3, TimeUnit.SECONDS)
                            .writeTimeout(3, TimeUnit.SECONDS)
                            .readTimeout(3, TimeUnit.SECONDS)
                            .build();
                }
            }
        }
        return okHttpClient;
    }

    private static Retrofit createRetrofit(String baseUrl) {

        return new Retrofit.Builder()
                .client(getOkHttpClient())
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static <T> T create(String baseUrl, Class<T> target) {
        return createRetrofit(baseUrl).create(target);
    }
}
