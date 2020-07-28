public class Bedroom {
    public static void main(String[] args) {
        System.out.println("This is abby bedroom");
        Bedroom obj = new Bedroom();
        double newS = obj.music();
        System.out.println(newS);
        System.out.println("..............");
        float newC= obj.radio();
        System.out.println(newC);
        System.out.println("..............");
    }
    public double music(){
        double song= 12;
        return song;
    }
    public float radio(){
        float channel= 13.56f;
        return channel;
    }
}
