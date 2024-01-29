import java.util.Scanner;

class Main {

    static void main_menu() {
        System.out.println("==================================> *** WLECOME TO MAIN MENU *** <==========================");
        System.out.println();
        System.out.println("                               >>>>>> ** ENTER YOUR CHOICE ** <<<<<<                        ");
        System.out.println();
        System.out.println("\t\t\t   1] ADD SHOWROOM \t\t\t 2] ADD EMPLOYEES \t\t\t 3] ADD CARS");
        System.out.println();
        System.out.println("\t\t\t   4] GET SHOWROOM \t\t\t 5] GET EMPLOYEES \t\t\t 6] GET CARS");
        System.out.println();
        System.out.println("==================================> *** PRESS 0 TO EXIT *** <===============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employees[] = new Employees[5];
        Cars cars[] = new Cars[5];
        int showroom_counter = 0;
        int employees_counter = 0;
        int cars_counter = 0;
        int choice = 100;

        while (choice != 0) {

            main_menu();
            System.out.print("your choice : ");
            choice = sc.nextInt();

            while (choice != 10 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("0]. EXIT");
                        System.out.println("1]. ADD NEW SHOWROOM");
                        System.out.println("10] GO BACK TO MAIN MENU ");
                        System.out.print("ENTER YOUR CHOICE : ");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        employees[employees_counter] = new Employees();
                        employees[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("0]. EXIT");
                        System.out.println("2]. ADD NEW EMPLOYEES");
                        System.out.println("10] GO BACK TO MAIN MENU ");
                        System.out.print("ENTER YOUR CHOICE : ");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        cars[cars_counter] = new Cars();
                        cars[cars_counter].set_details();
                        cars_counter++;
                        System.out.println();
                        System.out.println("0]. EXIT");
                        System.out.println("1]. ADD NEW CAR");
                        System.out.println("10] GO BACK TO MAIN MENU ");
                        System.out.print("ENTER YOUR CHOICE : ");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0] EXIT");
                        System.out.println("10] FO BACK TO MAIN MENU");
                        System.out.print("ENTER YOUR CHOICE : ");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employees_counter; i++) {
                            employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0] EXIT");
                        System.out.println("10] FO BACK TO MAIN MENU");
                        System.out.print("ENTER YOUR CHOICE : ");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < cars_counter; i++) {
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0] EXIT");
                        System.out.println("10] FO BACK TO MAIN MENU");
                        System.out.print("ENTER YOUR CHOICE : ");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER A VALID CHOICE : ");
                        break;
                }
            }
        }

    }
}
