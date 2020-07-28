public class Mobile25 {
    public void myMob(){
        String[] phone = {"1:samaung", "2:vivo", "3:xiaomi", "4:OPPO","5:Iphone"};
        for (String i : phone) {
            System.out.println("i had 5 phones : "+i);
        }
    }
    public static void main(String[] args) {
        System.out.println("i got iphone");
        String[] phone = {"samaung", "vivo", "xiaomi", "OPPO","Iphone"};
        for (String i : phone) {
            System.out.println(i);
        }
        Mobile25 obj = new Mobile25();
        obj.myMob();
    }
}
