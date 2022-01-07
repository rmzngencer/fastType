
package org.example;
import java.util.Scanner;

public class GameMode {
    GameScore gameScore = new GameScore();


    public int appear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose difficulty level! \n for Easy press-> 1 \n for Normal press-> 2 \n for Hard press-> 3");
        int zorluk=0;
        try {
             zorluk = scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("age should be integer. Please try again!!!");
            scanner.nextLine();
        }

        return zorluk;

    }

    public void showWord() throws InterruptedException {
    }
}
