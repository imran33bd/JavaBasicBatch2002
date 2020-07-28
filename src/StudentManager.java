public class StudentManager {

    static void calculate(){
        System.out.println("Calculate highest score of class students");
    }
    public static void main(String[] args) {
        int a = 99;
        int b = 66;
        int c = Math.min(a, b);
        System.out.println("Minimum Value = " + c);
    Student stuObj= new Student();
    stuObj.studentFatema();
    StudentManager smObj = new StudentManager();
    smObj.calculate();
    Test tObj= new Test();
    tObj.TestScore();
    }

}
