public class Dinning {
    public static void main(String[] args) {
        System.out.println("This is abby kitchen");
        Dinning obj = new Dinning();
        int newKnife = obj.knife();
        System.out.println(newKnife);
    }
    private int knife(){
        int longKnife = 3;
        int shortKnife = 7 ;
        int totalKnife= longKnife + shortKnife;
        return totalKnife;

    }
}
