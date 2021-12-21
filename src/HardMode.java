import java.util.Random;
import java.util.Scanner;

public class HardMode extends GameMode {
    private String[] hWord = {"hypnotize", "elephant", "aurora", "participant", "traditional", "opportunity", "violence", "authority", "arragement",
            "unrealistic", "society", "newspaper", "majority", "breakfast", "rhythm", "advisible", "composite", "diagnostic", "extensive", "independent",
            "remote", "shallow", "unknown", "wooden", "tropical", "unique", "virtual,", "inactive", "increase"};


    public void showWord()  {
        Random random = new Random();
        String comW = hWord[random.nextInt(29)];
        System.out.println(comW);


        Scanner scanner = new Scanner(System.in);
        String typedword = scanner.nextLine();
        if (comW.equals(typedword)) {
            gameScore.upDate(3);
        } else {
            System.out.println("you did wrong");
        }
    }
}
