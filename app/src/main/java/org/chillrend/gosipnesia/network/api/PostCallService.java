package org.chillrend.gosipnesia.network.api;

import org.chillrend.gosipnesia.realmodel.WpPost;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface PostCallService {

    @GET("posts?")
    Call<List<WpPost>> getHomePosts(
            @Query(value = "_fields", encoded = true) String fields,
            @Query(value = "_embed", encoded = true) String embeds
    );
}
