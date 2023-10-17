package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        Music music1 = context.getBean("musicBean",  ClassicalMusic.class);
        Music music2 = context.getBean("musicBean2", RockMusic.class);
        Music music3 = context.getBean("musicBean3", RapMusic.class);


        musicPlayer.playMusic();
        context.close();
    }
}


