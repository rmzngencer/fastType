package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

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
                case "y"  :
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

                    GameBody.gameBody();
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
                    gameScore.keepLastScore(0);


            case "n" :
                    // anonim oyuncu
                    System.out.println("Enter your name: ");
                    anonymousPlayer.setName(scanner.nextLine());
                    System.out.println("Enter your surname : ");
                    anonymousPlayer.setSurname(scanner.nextLine());

                    GameBody.gameBody();
                    System.out.println( anonymousPlayer.toString() + " your total score: " + gameScore.show());

                    gameScore.keepLastScore(0);

            case "out" :
                    a = false;
                    System.out.println("closed");

            default : System.out.println("please make a right choice");
            }
        }

    }
}
