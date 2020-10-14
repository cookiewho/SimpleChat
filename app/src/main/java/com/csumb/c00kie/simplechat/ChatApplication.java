package com.csumb.c00kie.simplechat;

import android.app.Application;

import com.parse.Parse;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        builder.networkInterceptors().add(httpLoggingInterceptor);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("IT9CFEu9H3rj1FHLMckJVUfExqCKZ3k4CWzpCj6L")
                .clientKey("tWEHG16AVN7KpuePR9NCjf7lLTzItE7DUmFeaLvB")
                .clientBuilder(builder)
                .server("https://parseapi.back4app.com").build());

    }
}
