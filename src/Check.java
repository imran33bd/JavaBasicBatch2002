public class Check {

    public static void main(String[] args){
        Computer obj2 = new Computer();
        obj2.paint();
        System.out.println("----------1st--------");

        String textMesg=obj2.print();
        System.out.println(textMesg);
        System.out.println("----------2nd--------");

        int nPrint = obj2.read();
        System.out.println(nPrint);
        System.out.println("----------3rd--------");

        Computer obj3 = new Computer();
        String textMeg=obj3.print();
        System.out.println(textMeg);
        System.out.println("----------4th--------");
    }
}
