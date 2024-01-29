import java.util.Scanner;

public class Cars extends Showroom implements utility{
    String car_name;
    String car_color;
    String fuel_type;
    int price;
    String car_type;
    String transmission;

    @Override
    public void get_details() {
        System.out.println("===============================>* * * * * CARS DETAILS * * * * *<===========================");
        System.out.println();
        System.out.println("Car Name : "+car_name);
        System.out.println("Car Color : "+car_color);
        System.out.println("Car type : "+car_type);
        System.out.println("Car price : "+price);
        System.out.println("Transmission : "+transmission);
        System.out.println("Fuel type : "+fuel_type);

    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================|> ENTER THE DETAILS OF CARS <|================================");
        System.out.println();
        System.out.print("Car Name : ");
        car_name=sc.nextLine();
        System.out.print("Car Color : ");
        car_color=sc.nextLine();
        System.out.print("Car Type (HYBRID / SEDAN / SUV) : ");
        car_type=sc.nextLine();
        System.out.print("Enter Car fuel type (PETROL / DIESEL / CNG) : ");
        fuel_type=sc.nextLine();
        System.out.print("Car Price : ");
        price=sc.nextInt();
        sc.nextLine();
        System.out.print("Transmission (AUTO / GEAR): ");
        transmission=sc.nextLine();
        total_cars_in_stock++;
    }
}
