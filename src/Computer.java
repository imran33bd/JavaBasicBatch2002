public class Computer {
    int num;
    Computer() {
        num = 200;
        System.out.println(num);
    }
    static void myMethod() {
        System.out.println("I just got executed!");
    } // static method belong to Computer class only,
    // only you can call it inside Computer classs
    public void paint(){
        System.out.println("hi, i wil start paint");
    }
    public String print(){
        String textMessage= "fatema";
        return textMessage;
    }
    public int read(){
        int numPrint =5;
        return numPrint;
    }
    public static void main(String[] args){
        System.out.println("--------1st ----------");
        myMethod();
        Computer obj1 = new Computer();
        obj1.paint();
        myMethod();
        System.out.println("---------2nd---------");
        obj1.paint();
        System.out.println("----------3rd--------");
        String textMesg=obj1.print();
        System.out.println(textMesg);
        System.out.println("----------4th--------");
        int nPrint = obj1.read();
        System.out.println(nPrint);
    }
}
