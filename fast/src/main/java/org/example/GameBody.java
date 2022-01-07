package org.example;

import java.util.concurrent.TimeUnit;

public class GameBody {
    public static  void play(GameMode gameMode) throws InterruptedException {
        gameMode.showWord();

    }

    public static void gameBody() throws InterruptedException {

        GameMode gameMode = new GameMode();

        int appear = gameMode.appear();
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        long startTime = System.currentTimeMillis();
        double seconds = 1;

        switch (appear) {
            case 1:
                System.out.println("Difficulty level will start from level Easy.");
                while (seconds > 0) {
                    play(new EasyMode());
                    System.out.println("your score: "+gameMode.gameScore.show());
                    long endTime = System.currentTimeMillis();
                    long estimatedTime = endTime - startTime;
                    seconds = 30 - ((double) estimatedTime / 1000);
                    System.out.println("hurry up!! you have " + seconds + " seconds");


                }
                break;
            case 2:
                System.out.println("Difficulty level will start from level Normal.");
                while (seconds > 0) {
                    play(new NormalMode());
                    System.out.println("your score: "+gameMode.gameScore.show());
                    long endTime = System.currentTimeMillis();
                    long estimatedTime = endTime - startTime;
                    seconds = 40 - (double) estimatedTime / 1000;
                    System.out.println("hurry up!! you have " + seconds + " seconds");

                }
                break;
            case 3:
                System.out.println("Difficulty level will start from level Hard.");
                while (seconds > 0) {
                    play(new HardMode());
                    System.out.println("your score: "+gameMode.gameScore.show());
                    long endTime = System.currentTimeMillis();
                    long estimatedTime = endTime - startTime;
                    seconds = 50 - (double) estimatedTime / 1000;
                    System.out.println("hurry up!! you have " + seconds + " seconds");

                }
            default:
                System.out.println("Difficulty level will start from level Easy.");
                while (seconds > 0) {
                    play(new EasyMode());
                    System.out.println("your score: "+gameMode.gameScore.show());
                    long endTime = System.currentTimeMillis();
                    long estimatedTime = endTime - startTime;
                    seconds = 30 - ((double) estimatedTime / 1000);
                    System.out.println(seconds);


                }
                break;
        }
    }
}
