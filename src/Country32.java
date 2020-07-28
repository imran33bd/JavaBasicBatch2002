public class Country32 {
    static void myCu(String cname, int year) {
        System.out.println(cname + " , " + year);
    }
    public static void main(String[] args) {
        System.out.println("country lists: ");
        myCu("Canada",1970);
        myCu("UK",1980);
        myCu("China",2020);
        myCu("USA",2028);
    }
}
