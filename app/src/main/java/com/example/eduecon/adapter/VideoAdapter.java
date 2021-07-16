package com.example.eduecon.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.example.eduecon.R;
import com.example.eduecon.databinding.ItemVideoExplanationBinding;
import com.example.eduecon.Model.Video;
import com.example.eduecon.utils.RecyclerViewCallback;

import java.util.ArrayList;
import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {

    private RecyclerViewCallback.ItemClick<Video> itemClick;
    private List<Video> currentList = new ArrayList<>();

    public void submitList(List<Video> items){
        currentList = items;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(RecyclerViewCallback.ItemClick<Video> onItemClickListener){
        itemClick = onItemClickListener;
    }

    @NonNull
    @Override
    public VideoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VideoAdapter.ViewHolder(ItemVideoExplanationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VideoAdapter.ViewHolder holder, int position) {
        holder.bind(currentList.get(position));
    }

    @Override
    public int getItemCount() {
        return currentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ItemVideoExplanationBinding binding;

        public ViewHolder(ItemVideoExplanationBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Video evalVideo) {

            binding.tvTitle.setText(evalVideo.getTitle());
            binding.tvSubtitle.setText(evalVideo.getSubtitle());

            Glide.with(binding.getRoot().getContext())
                    .load(evalVideo.getImageUrl())
                    .centerCrop()
                    .override(48, 48)
                    .transform(new RoundedCorners(14))
                    .skipMemoryCache(true)
                    .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                    .error(R.drawable.ic_icon_rounded_placeholder)
                    .placeholder(R.drawable.ic_icon_rounded_placeholder)
                    .into(binding.ivThumbnailVideo);

            if (itemClick == null) return;

            itemView.setOnClickListener(v -> {
                VideoAdapter.this.itemClick.onItemClick(v, evalVideo, getAdapterPosition());
            });
        }
    }
}
