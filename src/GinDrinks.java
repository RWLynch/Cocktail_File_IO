import java.util.Scanner;

public class GinDrinks {

    Menu menu = new Menu();

    public void ginMenu(){
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        printMenu();
        choice = scan.nextInt();
        while (choice != 5) {
            switch(choice) {
                case 1:
                    negroni();
                    break;
                case 2:
                    aviation();
                    break;
                case 3:
                    peguClub();
                    break;
                case 4:
                    ginBasilSmash();
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
                + "1) Negroni\n"
                + "2) Aviation\n"
                + "3) Pegu Club\n"
                + "4) Gin Basil Smash\n"
                + "5) Return to main menu\n"
        );
    }

    public void negroni(){
        System.out.println("*****************************************");
        System.out.println("*              The Negroni              *");
        System.out.println("*                                       *");
        System.out.println("*   1 oz Gin                            *");
        System.out.println("*   1 oz Sweet Vermouth                 *");
        System.out.println("*   1 oz Campari                        *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a mixing     *");
        System.out.println("*   glass and stir with ice. Strain     *");
        System.out.println("*   into a chilled old fashioned over   *");
        System.out.println("*   a large ice cube and express an     *");
        System.out.println("*   orange peel over the glass.         *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");
    }

    public void aviation(){

        System.out.println("*****************************************");
        System.out.println("*             The Aviation              *");
        System.out.println("*                                       *");
        System.out.println("*   2 oz Gin                            *");
        System.out.println("*   0.5 oz Maraschino Liqueur           *");
        System.out.println("*   0.5 oz Creme de Violette            *");
        System.out.println("*   0.75 oz Lemon                       *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a mixing     *");
        System.out.println("*   glass and stir with ice. I know     *");
        System.out.println("*   what you're thinking. \"STIR?!      *");
        System.out.println("*   With citrus!?\" You read right!     *");
        System.out.println("*   Strain into a chilled coup glass    *");
        System.out.println("*   and garnish with a brandied cherry. *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");
    }

    public void peguClub(){

        System.out.println("*******************************************");
        System.out.println("*             The Pegu Club               *");
        System.out.println("*                                         *");
        System.out.println("*   2 oz Gin                              *");
        System.out.println("*   0.75 oz Cointreau                     *");
        System.out.println("*   0.75 oz Lime                          *");
        System.out.println("*   1 dash Orange Bitters                 *");
        System.out.println("*   1 dash Angostrua Bitters              *");
        System.out.println("*                                         *");
        System.out.println("*   Combine ingredients in a shaking      *");
        System.out.println("*   tin and shake for 20 seconds.         *");
        System.out.println("*   Strain with a fine mesh strainer      *");
        System.out.println("*   into a chilled coup glass. Garnish    *");
        System.out.println("*   with a lime wheel.                    *");
        System.out.println("*                                         *");
        System.out.println("*******************************************");
    }

    public void ginBasilSmash(){

        System.out.println("*****************************************");
        System.out.println("*          The Gin Basil Smash          *");
        System.out.println("*                                       *");
        System.out.println("*   2 oz Gin                            *");
        System.out.println("*   1 oz Lemon                          *");
        System.out.println("*   0.75 Simple Syrup                   *");
        System.out.println("*   Basil Leaves                        *");
        System.out.println("*                                       *");
        System.out.println("*   Muddle the basil leaves and lemon   *");
        System.out.println("*   in a shaking tin. Add gin and       *");
        System.out.println("*   simple syrup. Shake with ice and    *");
        System.out.println("*   double strain into a double old     *");
        System.out.println("*   fashioned glass with crushed ice.   *");
        System.out.println("*   Garnish with a sprig of basil.      *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");
    }

}
