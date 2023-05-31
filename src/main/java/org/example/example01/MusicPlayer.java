package org.example.example01;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;


    public MusicPlayer() {}

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void myInit(){
        System.out.println("Beginning of Work!  //myInit()");
    }

    public void myDestroy(){
        System.out.println("End of Work!   //myDestroy()");
    }
}
