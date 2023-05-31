package org.example.example02;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MusicPlayer {

    private Music musicOne;

    private Music musicTwo;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    public MusicPlayer() {}

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic")Music musicOne,
                       @Qualifier("rockMusic")Music musicTwo) {
        this.musicOne = musicOne;
        this.musicTwo = musicTwo;
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
        System.out.println("Playing: " + musicOne.getSong() + "\nNext: " + musicTwo.getSong());
    }

    @PostConstruct
    public void myInit(){
        System.out.println("Beginning of Work!  //myInit()");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("End of Work!   //myDestroy()");
    }


}

