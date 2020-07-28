public class Cars26 {
    public void newCar(){
        String[] cars = {"BMW", "Toyota", "Ford"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
    }
    public static void main(String[] args) {
        System.out.println();
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        Cars26 obj = new Cars26();
        obj.newCar();
    }
}
