public class Main {

    public static void main(String[] args) {

        Phone myPhone = new Phone();
        myPhone.call();
        String textMessage = myPhone.sendText();
        System.out.println(textMessage);
        Car myCar = new Car();
        myCar.drive();
        Pen myPen = new Pen();
        myPen.write();
        myPen.paint();
        myPen.blue();
        myPen.pink();
    }

}
