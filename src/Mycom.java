public class Mycom {
    public static void main(String[] args) {
        System.out.println();
        Mycom obj = new Mycom();
        obj.sige();
        obj.sum();
        Fridge t2 = new Fridge();
        int tot = t2.frider();
        System.out.println(tot);
    }
    public void sige(){
        System.out.println("cold");
    }
    public void sum(){
        for(int i=0;i<7;i++){
            System.out.println(i);
            System.out.println("--------------");
        }
    }
}
