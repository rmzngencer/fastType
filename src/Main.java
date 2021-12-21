import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void play(GameMode gameMode) throws InterruptedException {
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


    public static void main(String[] args) throws InterruptedException {


        AnonymousPlayer anonymousPlayer = new AnonymousPlayer();
        RegisteredPlayer registeredPlayer = new RegisteredPlayer();
        GameScore gameScore = new GameScore();

        boolean a = true;

        while (a) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you a registered player? \n for yes press-> y \n for no press-> n \n if you wanna out write-> 'out'");
            String type = scanner.nextLine();
            switch (type) {
                case "y" -> {
                    //kayıtlı oyuncu
                    System.out.println("Enter your name: ");
                    registeredPlayer.setName(scanner.nextLine());
                    System.out.println("Enter your surname : ");
                    registeredPlayer.setSurname(scanner.nextLine());
                    try {
                        System.out.println("Enter your age : ");
                        registeredPlayer.setAge(scanner.nextInt());
                    } catch (Exception ex) {
                        System.out.println("your age gonna be 0");
                    }

                    gameBody();
                    registeredPlayer.setGameScore(gameScore.show());
                    System.out.println( registeredPlayer.toString() + " your total score: " + registeredPlayer.getGameScore());


                    DataManagements.addRecord(registeredPlayer.getName(), registeredPlayer.getSurname(), registeredPlayer.getAge(), registeredPlayer.getGameScore(), registeredPlayer.getId());
                    String cevap;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Do you want see player score press-> y \n to continue pres any");
                    cevap =sc.nextLine();
                    if(cevap.equals("y")){
                        System.out.println("record showed");
                        DataManagements.listRecord();
                    }
                    gameScore.setLastScore(0);

                }
                case "n" -> {
                    // anonim oyuncu
                    System.out.println("Enter your name: ");
                    anonymousPlayer.setName(scanner.nextLine());
                    System.out.println("Enter your surname : ");
                    anonymousPlayer.setSurname(scanner.nextLine());

                    gameBody();
                    System.out.println( anonymousPlayer.toString() + " your total score: " + gameScore.show());

                    gameScore.setLastScore(0);
                }
                case "out" -> {
                    a = false;
                    System.out.println("closed");
                }
                default -> System.out.println("please make a right choice");
            }
        }

    }
}
