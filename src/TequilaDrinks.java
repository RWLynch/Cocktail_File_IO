import java.util.Scanner;

public class TequilaDrinks {

    Menu menu = new Menu();

    public void tequilaMenu(){
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        printMenu();
        choice = scan.nextInt();
        while (choice != 5) {
            switch(choice) {
                case 1:
                    marg();
                    break;
                case 2:
                    oaxaca();
                    break;
                case 3:
                    paloma();
                    break;
                case 4:
                    division();
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
                + "1) Margarita\n"
                + "2) Oaxaca Old Fashioned\n"
                + "3) Paloma\n"
                + "4) Division Bell\n"
                + "5) Return to main menu\n"
        );
    }

    public void marg(){
        System.out.println("*****************************************");
        System.out.println("*             The Margarita             *");
        System.out.println("*                                       *");
        System.out.println("*   1.5 oz Reposado Tequila             *");
        System.out.println("*   0.75 oz Cointreau                   *");
        System.out.println("*   0.75 oz Lime                        *");
        System.out.println("*   0.25 oz Agave Syrup                 *");
        System.out.println("*                                       *");
        System.out.println("*   Rim an old fashioned glass with     *");
        System.out.println("*   a lime wedge and roll in salt.      *");
        System.out.println("*   Combine ingredients in a shaking    *");
        System.out.println("*   tin with ice and shake. Double      *");
        System.out.println("*   strain the cocktail into the        *");
        System.out.println("*   salt-rimmed old fashioned glass     *");
        System.out.println("*   filled with ice, and garnish with   *");
        System.out.println("*   a lime wedge.                       *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        menu.pause();
}

    public void oaxaca(){

        System.out.println("*****************************************");
        System.out.println("*         Oaxaca Old Fashioned          *");
        System.out.println("*                                       *");
        System.out.println("*   1.5 oz Tequila                      *");
        System.out.println("*   0.5 oz Mezcal                       *");
        System.out.println("*   0.25 oz Agave Syrup                 *");
        System.out.println("*   4 dashes Chocolate Bitters          *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a mixing     *");
        System.out.println("*   glass and stir with ice. Strain     *");
        System.out.println("*   into an old fashioned with a        *");
        System.out.println("*   large ice cube/sphere. Garnish      *");
        System.out.println("*   with a flamed orange peel.          *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        menu.pause();
    }

    public void paloma(){

        System.out.println("*****************************************");
        System.out.println("*              The Paloma               *");
        System.out.println("*                                       *");
        System.out.println("*   1.75 oz Blanco Tequila              *");
        System.out.println("*   1 oz Grapefruit Juice               *");
        System.out.println("*   0.5 oz Lime Juice                   *");
        System.out.println("*   0.25 oz Agave Syrup                 *");
        System.out.println("*   Grapefruit Soda (to top)            *");
        System.out.println("*                                       *");
        System.out.println("*   Fill a collins glass with ice.      *");
        System.out.println("*   Shake the first four ingredients    *");
        System.out.println("*   with ice in a shaking tin. Strain   *");
        System.out.println("*   into collins glass, top with        *");
        System.out.println("*   grapefruit soda, & briefly stir.    *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        menu.pause();
    }

    public void division(){

        System.out.println("*****************************************");
        System.out.println("*          The Division Bell            *");
        System.out.println("*    (Not tequila, but a must have!)    *");
        System.out.println("*                                       *");
        System.out.println("*   1 oz Mezcal                         *");
        System.out.println("*   0.75 oz Aperol                      *");
        System.out.println("*   0.5 oz Maraschino Liqueur           *");
        System.out.println("*   0.75 oz Lime Juice                  *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a shaking    *");
        System.out.println("*   tin with ice and shake. Double      *");
        System.out.println("*   strain the cocktail into a chilled  *");
        System.out.println("*   coupe glass and garnish with a      *");
        System.out.println("*   grapefruit zest twist.              *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        menu.pause();
    }

}
