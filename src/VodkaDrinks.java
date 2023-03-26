import java.util.Scanner;

public class VodkaDrinks {

    Menu menu = new Menu();

    public void vodkaMenu(){
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        printMenu();
        choice = scan.nextInt();
        while (choice != 5) {
            switch(choice) {
                case 1:
                    martini();
                    break;
                case 2:
                    cosmo();
                    break;
                case 3:
                    espresso();
                    break;
                case 4:
                    french();
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
                + "1) Vodka Martini\n"
                + "2) Cosmopolitan\n"
                + "3) Espresso Martini\n"
                + "4) French Martini\n"
                + "5) Return to main menu\n"
        );
    }

    public void martini(){
        System.out.println("*****************************************");
        System.out.println("*           The Vodka Martini           *");
        System.out.println("*                                       *");
        System.out.println("*   2.5 oz Vodka                        *");
        System.out.println("*   0.25 oz Dry Vermouth                *");
        System.out.println("*   Green Olive or Lemon Twist          *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a mixing     *");
        System.out.println("*   glass and stir with ice. Strain     *");
        System.out.println("*   into a chilled coupe glass and      *");
        System.out.println("*   garnish with a green olive or       *");
        System.out.println("*   with a lemon twist.                 *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        menu.pause();
    }

    public void cosmo(){

        System.out.println("*****************************************");
        System.out.println("*           The Cosmopolitan            *");
        System.out.println("*                                       *");
        System.out.println("*   1.5 oz Vodka                        *");
        System.out.println("*   0.5 oz Triple Sec                   *");
        System.out.println("*   1 oz Cranberry Juice                *");
        System.out.println("*   0.25 oz Lime Juice                  *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a shaking    *");
        System.out.println("*   tin with ice and shake. Double      *");
        System.out.println("*   strain the cocktail into a chilled  *");
        System.out.println("*   coupe glass. Garnish with a flamed  *");
        System.out.println("*   orange peel.                        *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        menu.pause();
    }

    public void espresso(){

        System.out.println("*****************************************");
        System.out.println("*            Espresso Martini           *");
        System.out.println("*                                       *");
        System.out.println("*   1.5 oz Coffee Liqueur               *");
        System.out.println("*   0.5 oz Vodka                        *");
        System.out.println("*   1 oz Espresso or Cold Brew          *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a shaking    *");
        System.out.println("*   tin with ice and shake. Double      *");
        System.out.println("*   strain the cocktail into a chilled  *");
        System.out.println("*   coupe glass. Garnish with three     *");
        System.out.println("*   coffee beans floating on the foam.  *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        menu.pause();
    }

    public void french(){

        System.out.println("*****************************************");
        System.out.println("*          The French Martini           *");
        System.out.println("*                                       *");
        System.out.println("*   2 oz Vodka                          *");
        System.out.println("*   0.5 oz Chambord                     *");
        System.out.println("*   1.5 oz Pineapple Juice              *");
        System.out.println("*                                       *");
        System.out.println("*   Combine ingredients in a shaking    *");
        System.out.println("*   tin with ice and shake. Double      *");
        System.out.println("*   strain the cocktail into a chilled  *");
        System.out.println("*   martini glass. Garnish with a       *");
        System.out.println("*   wedge of pineapple.                 *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        menu.pause();
    }

}
