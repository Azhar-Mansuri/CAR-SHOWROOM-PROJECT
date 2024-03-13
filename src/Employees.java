hhh
import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility  {
    String em_Id;
    String em_name;
    int  em_age;
    String em_department;

    @Override
    public void get_details() {
        System.out.println("=========================>* * * * * EMPLOYEES DETAILS * * * * *<============================");
        System.out.println();
        System.out.println("Id : "+em_Id);
        System.out.println("Name : "+em_name);
        System.out.println("Age : "+em_age);
        System.out.println("Department : "+em_department);
        System.out.println("Showroom Name : "+showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        em_Id=String.valueOf(uuid);

        System.out.println("=========================|> ENTER THE DETAILS OF EMPLOYEES <|===============================");
        System.out.println();
        System.out.print("Employee Name : ");
        em_name=sc.nextLine();
        System.out.print("Employee Age : ");
        em_age=sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Department : ");
        em_department=sc.nextLine();
        System.out.print("Showroom Name : ");
        showroom_name=sc.nextLine();


    }
}
