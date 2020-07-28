public class Kitchen {
    public static void main(String[] args) {
        System.out.println("This is fatema kitchen");
        Kitchen obj= new Kitchen();
        obj.cabinet();
        obj.table();
    }

    public void cabinet(){
        String spices = "masala";
        String oil ="olive";
        System.out.println(spices + oil);
    }
    public void table(){
        int pot = 5;
        int plate =20;
        int total= pot + plate;
        System.out.println(total);
    }
    }

