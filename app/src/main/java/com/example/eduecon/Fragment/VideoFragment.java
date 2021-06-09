package com.example.eduecon.Fragment;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eduecon.R;
import com.example.eduecon.adapter.VideoAdapter;
import com.example.eduecon.databinding.FragmentVideoBinding;
import com.example.eduecon.utils.VideoStore;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;

import org.jetbrains.annotations.NotNull;

public class VideoFragment extends Fragment {

    private FragmentVideoBinding binding;
    private VideoAdapter videoAdapter;
    private boolean isNotFullscreen = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentVideoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        videoAdapter = new VideoAdapter();
        getLifecycle().addObserver(binding.ypvExplanationVideo);

        videoAdapter.setOnItemClickListener((view, evalVideo, position) -> {
            binding.ypvExplanationVideo.getYouTubePlayerWhenReady(youTubePlayer ->
                    youTubePlayer.loadVideo(evalVideo.getVideoId(), 0)
            );
        });
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        super.onResume();
        videoAdapter.submitList(VideoStore.getVideos());

        binding.ypvExplanationVideo.addFullScreenListener(new YouTubePlayerFullScreenListener() {
            @Override
            public void onYouTubePlayerEnterFullScreen() {
                toggleFullscreen(false);
            }

            @Override
            public void onYouTubePlayerExitFullScreen() {
                toggleFullscreen(true);
            }
        });

        binding.rvVideoExplanation.setAdapter(videoAdapter);
        binding.rvVideoExplanation.setLayoutManager(new LinearLayoutManager(this));

        binding.ypvExplanationVideo.getYouTubePlayerWhenReady(youTubePlayer -> {
            if (VideoStore.getVideos().isEmpty()) return;
            youTubePlayer.cueVideo(VideoStore.getVideos().get(0).getVideoId(), 0);
        });
    }

    void toggleFullscreen(boolean isFullscreen) {
        if (isFullscreen) {
            getActivity().getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);

            if (getActivity().getSupportActionBar() != null) {
                requireActivity(). getSupportAction().show();
            }

            binding.rvVideoExplanation.setVisibility(View.VISIBLE);
            binding.tvTitleExplanation.setVisibility(View.VISIBLE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        } else {
            getActivity().getWindow().getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

            if (getSupportActionBar() != null) {
                getSupportActionBar().hide();
            }

            binding.rvVideoExplanation.setVisibility(View.GONE);
            binding.tvTitleExplanation.setVisibility(View.GONE);
            getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        this.isNotFullscreen = !isFullscreen;
    }

    @Override
    public void onBackPressed() {
        if (isNotFullscreen) {
            binding.ypvExplanationVideo.toggleFullScreen();
        } else {
            super.onBackPressed();
        }
    }
}