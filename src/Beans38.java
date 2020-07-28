import java.util.Scanner;
public class Beans38 {
    public static void main(String[] args) {
        System.out.println("yellow beans can make tofu");
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter num, name and product:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int num = myObj.nextInt();
        double product = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Num: " + num);
        System.out.println("Product: " + product);
    }
    }

