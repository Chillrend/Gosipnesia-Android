package org.chillrend.gosipnesia.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.chillrend.gosipnesia.R;
import org.chillrend.gosipnesia.realmodel.WpPost;

import java.util.ArrayList;
import java.util.List;

public class PostRecyclerViewAdapter
        extends RecyclerView.Adapter<PostRecyclerViewAdapter.PostViewHolder> {

    private List<WpPost> itemList = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_post_item, parent, false);

        return new PostViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder viewHolder, int position){
        WpPost post = itemList.get(position);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void setItemList(List<WpPost> itemList){
        this.itemList = itemList;
        notifyDataSetChanged();
    }

    class PostViewHolder extends RecyclerView.ViewHolder {
        private ImageView thumbnail;
        private TextView parent_category, title, category_date;

        public PostViewHolder(@NonNull View itemView){
            super(itemView);

            thumbnail = itemView.findViewById(R.id.post_thumbnail);
            parent_category = itemView.findViewById(R.id.post_parent_category);
            title = itemView.findViewById(R.id.text_input_password_toggle);
            category_date = itemView.findViewById(R.id.post_category_date);
        }
    }

}
