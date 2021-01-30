package org.chillrend.gosipnesia.repository;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import org.chillrend.gosipnesia.network.HTTPClient;
import org.chillrend.gosipnesia.network.api.PostCallService;
import org.chillrend.gosipnesia.realmodel.WpPost;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class WpPostRepository {
    private PostCallService postCallService;
    private MutableLiveData<List<WpPost>> postLiveData;

    public WpPostRepository(){
        postCallService = HTTPClient.createService(PostCallService.class);
    }

    public void listAllPost(String[] fields, String[] embeds){
        String fieldsParam = fields.length > 0 ? TextUtils.join(",", fields) : null;
        String embedsParam = embeds.length > 0 ? TextUtils.join(",", embeds) : null;

        Call<List<WpPost>> call = postCallService.getHomePosts(fieldsParam, embedsParam);
        call.enqueue(new Callback<List<WpPost>>() {
            @Override
            public void onResponse(Call<List<WpPost>> call, Response<List<WpPost>> response) {
                if(response.isSuccessful()){
                    postLiveData.postValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<WpPost>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public LiveData<List<WpPost>> getPostLiveData(){
        return postLiveData;
    }
}
