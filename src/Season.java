public class Season {
    public static void main(String[] args) {
        Season obj = new Season();
        obj.newSeason();
        int i = 0;
        do {
            System.out.println(i + " Spring");
            i++;
        }
        while (i < 3);
        System.out.println(" Summer");
    }
    public void newSeason(){
        int i = 0;
        do {
            System.out.println(i + " Autume");
            i++;
        }
        while (i < 5);
        System.out.println(" Winter");
    }
}