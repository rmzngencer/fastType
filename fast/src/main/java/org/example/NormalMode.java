package org.example;
import java.util.Random;
import java.util.Scanner;


public class NormalMode extends GameMode {
    private String[] nWord = {"budget", "pillow", "flowers", "cable", "crown", "airplane", "machine", "keyboard", "strategy", "banana", "awkward", "clumsy", "pathetic", "homework", "print", "blanket", "tissue", "mirror", "stick", "equality", "whistle", "virtual", "reality", "aurora", "career", "quality", "private", "growth", "establish", "approach", "ability", "bullet", "queen", "cloud", "coach"};


    public void showWord() {
        Random random = new Random();
        String comW = nWord[random.nextInt(35)];
        System.out.println(comW);


        Scanner scanner = new Scanner(System.in);
        String typedword = scanner.nextLine();
        if (comW.equals(typedword)) {
            gameScore.upDate(2);

        } else {
            System.out.println("you did wrong");
        }

    }
}
