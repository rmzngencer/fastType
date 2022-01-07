package org.example;
public class RegisteredPlayer extends Player{
    private int age;
    private int gameScore;

    public RegisteredPlayer() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

}
