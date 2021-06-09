package com.example.eduecon.models;

public class Video {
    private String title, subtitle, videoId;

    public Video() {
    }

    public Video(String title, String subtitle, String videoId) {
        this.title = title;
        this.subtitle = subtitle;
        this.videoId = videoId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getVideoUrl() {
        return "https://youtu.be/" + videoId;
    }

    public String getImageUrl() {
        return "https://img.youtube.com/vi/" + videoId + "/0.jpg";
    }
}

