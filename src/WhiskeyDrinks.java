import java.util.Scanner;

public class WhiskeyDrinks {

    Menu menu = new Menu();

    public void whiskeyMenu(){
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        printMenu();
        choice = scan.nextInt();
        while (choice != 5) {
            switch(choice) {
                case 1:
                    manhattan();
                    break;
                case 2:
                    oldFashioned();
                    break;
                case 3:
                    inFashion();
                    break;
                case 4:
                    boulevardier();
                    break;
                case 5:
                    menu.run();
                    break;
                default:
                    System.out.println("Please enter a valid selection.");
                    break;
            }

            printMenu();
            choice = scan.nextInt();

        }
    }

    public void printMenu(){
        System.out.println("Please select one of the following:\n"
                + "1) Manhattan\n"
                + "2) Old Fashioned\n"
                + "3) In Fashion\n"
                + "4) Boulevardier\n"
                + "5) Return to main menu\n"
        );
    }

    public void manhattan(){
        System.out.println("*****************************************");
        System.out.println("*             The Manhattan             *");
        System.out.println("*                                       *");
        System.out.println("*   2 oz Bourbon                        *");
        System.out.println("*   1 oz Sweet Vermouth                 *");
        System.out.println("*   2 dashes Angostura Bitters          *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a mixing     *");
        System.out.println("*   glass and stir with ice. Strain     *");
        System.out.println("*   into a chilled coupe glass and      *");
        System.out.println("*   garnish with a brandied cherry.     *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        menu.pause();
}

    public void oldFashioned(){

        System.out.println("*****************************************");
        System.out.println("*         The Old Fashioned             *");
        System.out.println("*                                       *");
        System.out.println("*   2 oz Bourbon                        *");
        System.out.println("*   1 barspoon Simple Syrup             *");
        System.out.println("*   2 dashes Angostura Bitters          *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a mixing     *");
        System.out.println("*   glass and stir with ice. Strain     *");
        System.out.println("*   into a chilled old fashioned,       *");
        System.out.println("*   garnish with a brandied cherry &    *");
        System.out.println("*   an orange peel.                     *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");
    }

    public void inFashion(){

        System.out.println("*****************************************");
        System.out.println("*            The In-Fashion             *");
        System.out.println("*                                       *");
        System.out.println("*   2 oz Bourbon                        *");
        System.out.println("*   1 barspoon Simple Syrup             *");
        System.out.println("*   4 dashes Angostura Bitters          *");
        System.out.println("*   4 dashes Orange Bitters             *");
        System.out.println("*   1 large swath lemon peel            *");
        System.out.println("*   1 barspoon of Mezcal                *");
        System.out.println("*                                       *");
        System.out.println("*   In a rocks glass, muddle the        *");
        System.out.println("*   syrup and lemon peel with bitters.  *");
        System.out.println("*   Add bourbon and a large ice cube.   *");
        System.out.println("*   Stir until chilled. Using a         *");
        System.out.println("*   barspoon, float mezcal over the     *");
        System.out.println("*   top of the drink. Garnish with an   *");
        System.out.println("*   expressed lemon peel.               *");
        System.out.println("*****************************************");
    }

    public void boulevardier(){

        System.out.println("*****************************************");
        System.out.println("*          The Boulevardier             *");
        System.out.println("*                                       *");
        System.out.println("*   1 oz Bourbon                        *");
        System.out.println("*   1 oz Campari                        *");
        System.out.println("*   1 oz Sweet Vermouth                 *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a mixing     *");
        System.out.println("*   glass and stir with ice. Strain     *");
        System.out.println("*   into a chilled old fashioned over   *");
        System.out.println("*   a large ice cube and express an     *");
        System.out.println("*   orange peel over the glass.         *");
        System.out.println("*****************************************");
    }

}
