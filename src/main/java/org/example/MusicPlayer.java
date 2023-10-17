package org.example;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Music> playlist = new ArrayList<Music>();
    private Music music, music2;
    public String name;
    public int volume;
    //IoC
    MusicPlayer(Music music, Music music2){
        this.music = music;
        this.music2 = music2;
    }
    MusicPlayer(){
    }
    public void addSong(Music music){
        this.playlist.add(music);
    }
    public ArrayList<Music> getPlaylist(){
        return this.playlist;
    }
    public void playMusic(){
        for (int i = 0; i < this.playlist.size(); i++){
            System.out.println(this.playlist.get(i).getSong());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
