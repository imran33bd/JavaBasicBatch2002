public class Dog {
    String breed;
    int age;
    String color;

    void barking() {
        color= "white";
        System.out.println("wang wang ..." + color);
    }
    void hungry() {
        age = 3;
        System.out.println("I am eating bread ...and i am " + age + "years old" );
    }

    void sleeping() {
        breed= "bichon frise";
        System.out.println("zzz zzz ...i am " + breed );
    }
}
