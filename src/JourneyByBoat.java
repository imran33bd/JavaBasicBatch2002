public class JourneyByBoat {
    // default constructor
    public JourneyByBoat(){
        System.out.println("Default Value");
    }
    public JourneyByBoat(String Fery) {
        System.out.println( "here and there" + Fery);
    }

    public static void main(String[] args) {
        JourneyByBoat MyBoat = new JourneyByBoat("\n Looking to going further");

        JourneyByBoat YourBoat = new JourneyByBoat();
    }
}
