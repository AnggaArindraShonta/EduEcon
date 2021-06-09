package com.example.eduecon.utils;

import com.example.eduecon.models.Video;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {

    public static List<Video> getEvalVideos() {
        List<Video> evalVideos = new ArrayList<>();
        evalVideos.add(new Video("Tari Kipas", "Sulawesi Selatan", "YQYfOvtYBpE"));
        evalVideos.add(new Video("Tari Makan Sirih", "Riau", "4O17iPq5dfg"));
        evalVideos.add(new Video("Tari Piring", "Sumatera Barat", "yt4SvmjCNNE"));
        evalVideos.add(new Video("Tari Lumense", "Sulawesi Tenggara", "5zC8MRqk8OI"));
        evalVideos.add(new Video("Tari Pendet", "Bali", "8j9swRxXtCo"));
        evalVideos.add(new Video("Tari Gambyong", "Jawa Tengah", "D8sp-WrTqWI"));
        evalVideos.add(new Video("Tari Topeng", "Jakarta", "tITtITqAhrQ"));
        evalVideos.add(new Video("Tari Saman", "Aceh", "92lM805pfzU"));
        evalVideos.add(new Video("Tari Selampit Delapan", "Jambi", "5mLucfGnKUc"));
        evalVideos.add(new Video("Tari Baksa Kembang", "Kalimantan Selatan", "vBKDl-GYU7A"));
        evalVideos.add(new Video("Tari Gong", "Kalimantan Timur", "A58Rf00gup8"));
        evalVideos.add(new Video("Tari Selamat Datang", "Papua", "ZfzfWDiKMfk"));
        evalVideos.add(new Video("Tari Golek Menak", "Yogyakarta", "ZISA9LFC1eE"));
        evalVideos.add(new Video("Tari Kecak", "Bali", "0Xm6Sqv1cok"));
        evalVideos.add(new Video("Tari Tanggai", "Sumatera Selatan", "e_nYxhjHEW4"));
        evalVideos.add(new Video("Tari Jaipong", "Jawa Barat", "cc3nf8H1MtA"));
        evalVideos.add(new Video("Tari Tor - Tor", "Sumatera Utara", "ZDlVYgo8LVQ"));
        return evalVideos;
    }

}
