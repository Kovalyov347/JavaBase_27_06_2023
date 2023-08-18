package ua.hillel.kovalyov.homeworks;

class MusicStyle {

    public void playMusic() {

        System.out.println("Playing music...");

    }

}

class PopMusic extends MusicStyle {

    @Override

    public void playMusic() {

        System.out.println("Playing pop music...");

    }

}

class RockMusic extends MusicStyle {

    @Override

    public void playMusic() {

        System.out.println("Playing rock music...");

    }

}

class ClassicMusic extends MusicStyle {

    @Override

    public void playMusic() {

        System.out.println("Playing classic music...");

    }

}