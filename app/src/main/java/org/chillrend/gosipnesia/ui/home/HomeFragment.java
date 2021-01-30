package org.chillrend.gosipnesia.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import org.chillrend.gosipnesia.R;
import org.chillrend.gosipnesia.adapters.PostRecyclerViewAdapter;
import org.chillrend.gosipnesia.realmodel.WpPost;

import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private PostRecyclerViewAdapter postRecyclerViewAdapter;
    private RecyclerView recyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        homeViewModel.init();

        //TODO: instantiate the adapter
        postRecyclerViewAdapter = new PostRecyclerViewAdapter();

        homeViewModel.getPost().observe(getViewLifecycleOwner(), new Observer<List<WpPost>>() {
            @Override
            public void onChanged(List<WpPost> wpPosts) {
                //TODO: set data to the adapter
            }
        });
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = root.findViewById(R.id.home_recycler_view);

        return root;
    }
}