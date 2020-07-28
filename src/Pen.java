public class Pen {
    public static void main(String[] args){

        // Write the name of the desgin(class name) nameOfYourObject = Assign someone to build the object using the
        // desgin Pen()
        // Pen() --> Constructor --> Is capable to create Object in Java
        // new Java reserved key word

        Pen myPen = new Pen();
        myPen.write();
        myPen.paint();
        myPen.blue();
        myPen.pink();
    }
    public void write(){
        System.out.println("Writing using the pen");
    }
    public void paint(){
        System.out.println("This method is responsible to paint");
    }
    public void pink(){
        System.out.println("Switch to pink color");
    }
    public void blue(){
        System.out.println("Switch to blue color");
    }
}
