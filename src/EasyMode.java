import java.util.Random;
import java.util.Scanner;


public class EasyMode extends GameMode {
    private String[] eWord = {"apple", "pencil", "fine", "goal", "lie", "call", "last", "add", "after", "age", "area", "away", "city", "cold", "day", "dark",
            "down", "flow", "jump", "love", "over", "move", "rain", "sign", "wood", "yard", "west", "value", "edge", "uncle", "moon", "under", "valley", "wing",
            "tone", "glow", "pink", "harm", "table", "safe", "after", "slim", "pizza"};

    public void showWord() throws InterruptedException {


        Random random = new Random();
        String comW = eWord[random.nextInt(42)];
        System.out.println(comW);


        Scanner scanner = new Scanner(System.in);
        String typedword = scanner.nextLine();
        if (comW.equals(typedword)) {
            gameScore.upDate(1);
        } else {
            System.out.println("you did wrong");
        }

    }

}
