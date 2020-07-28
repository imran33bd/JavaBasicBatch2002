public class Salon {
    Salon() {
        String[] salon = {"-wash", "-blow", "-dry", "-pay"};
        for (int i = 0; i < salon.length; i++) {
            System.out.println(salon[i]);
        }
    }
        public static void main (String[]args){
            System.out.println("getting hair cut");
            String[] salonn = {"wash", "blow", "dry", "pay"};
            for (int i = 0; i < salonn.length; i++) {
                System.out.println(salonn[i]);
                Salon obj =new Salon();

            }

        }
    }

