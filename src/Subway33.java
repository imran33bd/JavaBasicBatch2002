public class Subway33 {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println("service terminated");
        int myNum1 = plusMethodInt(12, 12);
        double myNum2 = plusMethodDouble(4.09, 6.7834);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
