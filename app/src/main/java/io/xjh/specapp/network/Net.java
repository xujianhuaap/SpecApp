package io.xjh.specapp.network;

import io.xjh.specapp.Api;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xujianhua on 2017/4/26.
 */

public interface Net {
    void init();
    void request();

}
class NetImpl implements Net {

    private Retrofit mRetrofit;

    public void init() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public void request() {

    }
}