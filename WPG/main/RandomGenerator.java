package main;

import java.util.Random;

import student.Information;

public class RandomGenerator {
    static Random random = new Random();
    private static int bound;
    private static int bound2;

    public static int getRandomName(){
        random.setSeed(System.nanoTime());
        bound = Information.getNameSize();
        return random.nextInt(bound);
    }

    public static int getRandomItem(){
        random.setSeed(System.nanoTime());
        bound = Information.getItemSize();
        return random.nextInt(bound);
    }

    public static int getRandomRange(){
        random.setSeed(System.nanoTime());
        bound = Information.getMin();
        bound2 = Information.getMax();
        return bound+random.nextInt(bound2-bound);
    }
}
