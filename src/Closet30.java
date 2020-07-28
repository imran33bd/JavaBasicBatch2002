import java.util.ArrayList;
public class Closet30 {
    public static void main(String[] args) {
        System.out.println("white closet");
        ArrayList<String> closets = new ArrayList<String>();
        closets.add("drawer1");
        closets.add("drawer2");
        closets.add("hanger1");
        closets.add("hanger2");
        for (String i : closets) {
            System.out.println(i);
        }
    }
}
