public class Classroom35 {
    static void myMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) {
        System.out.println("first classroom");
        myMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        Classroom35 myObj = new Classroom35(); // Create an object of MyClass
        myObj.myPublicMethod();

    }
}
