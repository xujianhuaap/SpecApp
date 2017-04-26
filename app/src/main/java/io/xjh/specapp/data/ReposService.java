package io.xjh.specapp.data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by xujianhua on 26/04/17.
 */

public interface ReposService {
    @GET("/users/{user}/repos")
    Call<List> getRepos(@Path("user")String user);

}
