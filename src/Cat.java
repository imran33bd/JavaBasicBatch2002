public class Cat {
    public static void main(String[] args) {
        System.out.println();
        Cat obj = new Cat();
        obj.sum();
        Fridge t2 = new Fridge();
        int tot = t2.frider();
        System.out.println(tot);
        Mycom obj1 = new Mycom();
        obj1.sige();
    }
    public void sum() {
        for (int i = 0; i < 7; i++) {
            System.out.println(i);
            System.out.println("--miao--" + i);
        }
    }
}
