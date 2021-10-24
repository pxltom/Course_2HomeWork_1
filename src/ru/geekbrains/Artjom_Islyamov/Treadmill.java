package ru.geekbrains.Artjom_Islyamov;

public class Treadmill  implements Obstacle {
    private final int length;
    Treadmill(int length){
        this.length=length;
    }

    @Override
    public boolean contest(Contestant contestant) {
        if(contestant.run(length)){
            System.out.println(contestant + " пробежал дистанцию!");
            return true;
        }else {
            System.out.println(contestant + " не смог пробежать дистанцию!");
            return false;
        }

    }
}

