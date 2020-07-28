public class Fish36 {
    enum Kind {
        SALMON,
        TUNA,
        YEALLOWTAIL
    }

    public static void main(String[] args) {
        System.out.println("Fish head soup");
        Kind myF = Kind.TUNA;
        System.out.println(myF);
    }
}

