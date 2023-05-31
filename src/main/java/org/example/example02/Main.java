package org.example.example02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("Working: " + musicPlayer.getName());
        System.out.println("Noise: " + musicPlayer.getVolume());
        musicPlayer.playMusic();

        context.close();
    }
}
