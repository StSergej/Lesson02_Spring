package org.example.example01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicMusic classicMusic = context.getBean("classicMusic", ClassicMusic.class);
        System.out.println("Playing - " + classicMusic.getSong());

        RockMusic rockMusic = context.getBean("musicBeanRock", RockMusic.class);
        System.out.println("Playing - " + rockMusic.getSong());

        System.out.println("--------------------------------");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("Working: " + musicPlayer.getName());
        System.out.println("Noise: " + musicPlayer.getVolume());

        musicPlayer.playMusic();

        context.close();
        

    }
}
