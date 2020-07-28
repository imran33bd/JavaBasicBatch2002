public class Student {
    static void studentFatema(){
        System.out.println("studentFatema belongs to Student class!");
    }
    public static void main(String[] args) {
        studentFatema();
        System.out.println("studentFatema got called first time!");
        studentFatema();
        System.out.println("studentFatema got called 2nd time!");
        studentFatema();
        System.out.println("studentFatema got called 3rd time!");

    }
}
