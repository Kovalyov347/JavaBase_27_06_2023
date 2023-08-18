package ua.hillel.kovalyov.homeworks;

public class Main1 {

    public static void main(String[] args) {

        MusicStyle[] musicStyle = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyle style : musicStyle) {

            style.playMusic();

        }

    }

}