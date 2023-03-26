import java.util.Scanner;

public class RumDrinks {

    Menu menu = new Menu();

    public void rumMenu(){
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        printMenu();
        choice = scan.nextInt();
        while (choice != 5) {
            switch(choice) {
                case 1:
                    elPresidente();
                    break;
                case 2:
                    daiquiri();
                    break;
                case 3:
                    mojito();
                    break;
                case 4:
                    bitterMaiTai();
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
                + "1) El Presidente\n"
                + "2) Daiquiri\n"
                + "3) Mojito\n"
                + "4) Bitter Mai Tai\n"
                + "5) Return to main menu\n"
        );
    }

    public void elPresidente(){

        System.out.println("*****************************************");
        System.out.println("*             El Presidente             *");
        System.out.println("*                                       *");
        System.out.println("*   1.5 oz Rum                          *");
        System.out.println("*   0.5 oz Sweet Vermouth               *");
        System.out.println("*   0.33 oz Cointreau                   *");
        System.out.println("*   2 dashes Grenadine                  *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a mixing     *");
        System.out.println("*   glass and stir with ice. Strain     *");
        System.out.println("*   into a chilled coupe glass.         *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        menu.pause();
    }

    public void daiquiri(){

        System.out.println("*******************************************");
        System.out.println("*            The Daiquiri                 *");
        System.out.println("*                                         *");
        System.out.println("*   1.66 oz White Rum                     *");
        System.out.println("*   0.5 oz Lime Juice                     *");
        System.out.println("*   0.33 oz Rich Simple Syrup             *");
        System.out.println("*                                         *");
        System.out.println("*   Combine ingredients in a shaking      *");
        System.out.println("*   tin and shake for 20 seconds.         *");
        System.out.println("*   Strain with a fine mesh strainer      *");
        System.out.println("*   into a chilled coupe glass. Garnish   *");
        System.out.println("*   with a lime wedge.                    *");
        System.out.println("*                                         *");
        System.out.println("*******************************************");

        menu.pause();
    }

    public void mojito(){

        System.out.println("*******************************************");
        System.out.println("*                 Mojito                  *");
        System.out.println("*                                         *");
        System.out.println("*   14 Mint Leaves                        *");
        System.out.println("*   2 oz Gold Rum                         *");
        System.out.println("*   0.5 oz Lime Juice                     *");
        System.out.println("*   0.33 Rich Simple Syrup                *");
        System.out.println("*   0.5 oz Soda Water                     *");
        System.out.println("*                                         *");
        System.out.println("*   Add mint, rum, lime, and syrup        *");
        System.out.println("*   into a glass two-thirds filled        *");
        System.out.println("*   with crushed ice. Stir with a         *");
        System.out.println("*   bar spoon and fill the glass          *");
        System.out.println("*   with crushed ice. Top with a splash   *");
        System.out.println("*   of soda, briefly stir and serve.      *");
        System.out.println("*                                         *");
        System.out.println("*******************************************");

        menu.pause();
    }

    public void bitterMaiTai(){

        System.out.println("*******************************************");
        System.out.println("*          The Bitter Mai Tai             *");
        System.out.println("*           by Jeremy Oertel              *");
        System.out.println("*                                         *");
        System.out.println("*   1.5 oz Campari                        *");
        System.out.println("*   0.75 oz Rum                           *");
        System.out.println("*   0.5 oz Dry Curaçao                    *");
        System.out.println("*   1 oz Lime                             *");
        System.out.println("*   0.75 oz Orgeat                        *");
        System.out.println("*                                         *");
        System.out.println("*   Combine ingredients in a shaking      *");
        System.out.println("*   tin and shake for 20 seconds.         *");
        System.out.println("*   Strain with a fine mesh strainer      *");
        System.out.println("*   into a chilled coupe glass. Garnish   *");
        System.out.println("*   with a lime wedge.                    *");
        System.out.println("*                                         *");
        System.out.println("*******************************************");

        menu.pause();
    }
}
