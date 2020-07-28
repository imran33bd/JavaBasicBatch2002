public class Mywindow {
    public static void main(String[] args) {
        System.out.println("This is abby window");
        Mywindow obj = new Mywindow();
        obj.window();
        System.out.println("------------------");
        obj.window();
    }
   public void window(){
        int smallW =3;
        float bigW =2.5f;
        int totalW= smallW + (int)bigW;
       System.out.println(totalW);
   }
}
