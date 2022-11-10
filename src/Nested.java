import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("mohamed abdulahi aden");
                break;
            case 2:
                System.out.println("ayaan abdirahman");
                break;
            case 3:
                System.out.println("Emp number 3");

            switch (department) {
                case "IT":
                    System.out.println("software engeneeing");
                    break;
                case "Management":
                    System.out.println("business");
                    break;
                default:
                    System.out.println("Enter correct department");
            }
            break;

            default:
                System.out.println("Enter correct EmpID");
        }
    }
}

