package org.chillrend.gosipnesia.ui.home;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.AndroidViewModel;
import org.chillrend.gosipnesia.realmodel.WpPost;
import org.chillrend.gosipnesia.repository.WpPostRepository;

import java.util.List;

public class HomeViewModel extends AndroidViewModel {

    private WpPostRepository postRepository;
    private LiveData<List<WpPost>> post;

    public HomeViewModel(@NonNull Application application) {
        super(application);
    }

    public void init() {
        postRepository = new WpPostRepository();
        post = postRepository.getPostLiveData();
    }

    public void getAllPost(String[] fields, String[] embeds){
        postRepository.listAllPost(fields, embeds);
    }

    public LiveData<List<WpPost>> getPost() {
        return post;
    }
}