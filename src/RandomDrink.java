import java.util.Scanner;
import java.util.Random;

public class RandomDrink {

    public void randomCocktail(){

        WhiskeyDrinks whiskeyDrinks = new WhiskeyDrinks();
        VodkaDrinks vodkaDrinks = new VodkaDrinks();
        RumDrinks rumDrinks = new RumDrinks();
        GinDrinks ginDrinks = new GinDrinks();
        TequilaDrinks tequilaDrinks = new TequilaDrinks();
        Logger logger = new Logger();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Menu menu = new Menu();

        int randomInt = random.nextInt(20);
        if (randomInt == 1){
            whiskeyDrinks.manhattan();
        }
        if (randomInt == 2){
            whiskeyDrinks.oldFashioned();
        }
        if (randomInt == 3){
            whiskeyDrinks.inFashion();
        }
        if (randomInt == 4){
            whiskeyDrinks.boulevardier();
        }
        if (randomInt == 5){
            ginDrinks.negroni();
        }
        if (randomInt == 6){
            ginDrinks.ginBasilSmash();
        }
        if (randomInt == 7){
            ginDrinks.aviation();
        }
        if (randomInt == 8){
            ginDrinks.peguClub();
        }
        if (randomInt == 9){
            vodkaDrinks.martini();
        }
        if (randomInt == 10){
            vodkaDrinks.cosmo();
        }
        if (randomInt == 11){
            vodkaDrinks.espresso();
        }
        if (randomInt == 12){
            vodkaDrinks.french();
        }
        if (randomInt == 13){
            rumDrinks.bitterMaiTai();
        }
        if (randomInt == 14){
            rumDrinks.daiquiri();
        }
        if (randomInt == 15){
            rumDrinks.elPresidente();
        }
        if (randomInt == 16){
            rumDrinks.mojito();
        }
        if (randomInt == 17){
            tequilaDrinks.division();
        }
        if (randomInt == 18){
            tequilaDrinks.paloma();
        }
        if (randomInt == 19){
            tequilaDrinks.oaxaca();
        }
        if (randomInt == 20){
            tequilaDrinks.marg();
        }
        menu.pause();
    }

    public void dice(){

        Menu menu = new Menu();

        System.out.println("       .-------.    ______");
        System.out.println("      /   o   /|   /\\     \\");
        System.out.println("     /_______/o|  /o \\  o  \\");
        System.out.println("     | o     | | /   o\\_____\\");
        System.out.println("     |   o   |o/ \\o   /o    /");
        System.out.println("     |     o |/   \\ o/  o  /");
        System.out.println("     '-------'     \\/____o/");
        System.out.println("");
        System.out.println("        What will it be??");
        System.out.println("");

        menu.pause();
    }
}
