package org.example;
public class GameScore {



    private static int lastScore;

    public static int getLastScore() {
        return lastScore;
    }

    public static void keepLastScore(int lastScore) {
        GameScore.lastScore = lastScore;
    }

    public void upDate(int score) {
        lastScore = lastScore + score;
        System.out.println("good!! you get " + score + " point");

    }

    public int show() {
        return lastScore;
    }


}
