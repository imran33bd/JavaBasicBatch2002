import java.util.Scanner;
public class BrooklynBrnch {

        private BrooklynBrnch(int i, String beriani){
            System.out.println("\nMay i order something pls? "+ i + beriani);
        }
        public BrooklynBrnch(){
            System.out.print("I am defult constructor");
        }
        public BrooklynBrnch(String cook){
            System.out.println("\n" + "The name of cook: " + cook);
        }
        public BrooklynBrnch(int hour, int perHour, int salary){
        // int perHour = 40;
       // Scanner sc = new Scanner(System.in);
        System.out.print("\n" + "How many hour you worked this week?  ");
        // String str = sc.nextLine();

        //  System.out.println("The salary: " + (hour * str);
    }
        public static void main(String[] args) {
            BrooklynBrnch obj1= new BrooklynBrnch();
            BrooklynBrnch obj2= new BrooklynBrnch(3,"lamb beriani");
            BrooklynBrnch brooklyn = new BrooklynBrnch("Sobuj");

            Scanner myObj = new Scanner(System.in);
            int hour;
            int perHour;

            // Enter username and press Enter
            System.out.println("Enter hour");
            hour = myObj.nextInt();
            System.out.println("working hour is: " + hour);

            System.out.println("Enter perHour");
            perHour = myObj.nextInt();
            System.out.println("perHour is: " + perHour);

            int salary= hour* perHour;
            System.out.println("Here is the total salary: "+ salary);
        }
    }


