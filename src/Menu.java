import java.util.Scanner;
import java.util.Random;

import static java.lang.Math.random;

public class Menu {

    public static void run(){
        WhiskeyDrinks whiskeyDrinks = new WhiskeyDrinks();
        VodkaDrinks vodkaDrinks = new VodkaDrinks();
        RumDrinks rumDrinks = new RumDrinks();
        GinDrinks ginDrinks = new GinDrinks();
        Logger logger = new Logger();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int choice = -1;
        printMenu();
        choice = scan.nextInt();
        while (choice != 0) {
            switch(choice) {
                case 1:
                    whiskeyDrinks.whiskeyMenu();
                    break;
                case 2:
                    System.out.println("Vodka drinks coming soon!");
                    break;
                case 3:
                    rumDrinks.rumMenu();
                    break;
                case 4:
                    System.out.println("Tequila drinks coming soon!");
                    break;
                case 5:
                    ginDrinks.ginMenu();
                    break;
                case 6:
                    logger.suggestionMenu();
                    break;
                case 7:
                    System.out.println(random.nextInt(30));
                    break;
                default:
                    System.out.println("This is an invalid selection");
                    break;
            }

            printMenu();
            choice = scan.nextInt();

        }
        System.out.println("Thank you for using this program");
    }

    public static void printMenu(){
        System.out.println("Please select a base spirit:\n"
                + "1) Whiskey\n"
                + "2) Vodka\n"
                + "3) Rum\n"
                + "4) Tequila\n"
                + "5) Gin\n"
                + "6) Add a drink\n"
                + "7) Random!\n"
                + "0) Exit Program\n");
    }

    public static void asciiArtMenu(){
        System.out.println("********************************************");
        System.out.println("  _");
        System.out.println(" {_}");
        System.out.println(" |(|");
        System.out.println(" |=|");
        System.out.println("/   \\           What Are We Drinking");
        System.out.println("|.--|                   Tonight?");
        System.out.println("||  |");
        System.out.println("||  |    .    ' .");
        System.out.println("|'--|  '     \\~~~/");
        System.out.println("'-=-' \\~~~/   \\_/");
        System.out.println("       \\_/     Y");
        System.out.println("        Y     _|_");
        System.out.println("       _|_                        art by jgs");
        System.out.println("********************************************");
    }

    public void pause() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPress Enter to continue...");
        scan.nextLine();
    }
}
