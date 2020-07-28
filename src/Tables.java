public class Tables {
    public static void main(String[] args) {
        System.out.println("hungry....");
        Tables t1= new Tables();
        int nchair = t1.chair();
        System.out.println(nchair);
    }
    static int chair(){
        int a= 4;
        int b= 2;
        int c= a+b;
        int d= a-b;
        return c/d;
    }
    Tables(){
        int a= 3;
        int b= 2;
        int c= a+b;
        int d= a-b;
        System.out.println(c + " --short chairs and tall chairs--" + d );
    }
}
