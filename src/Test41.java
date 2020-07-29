import java.util.HashSet;
public class Test41 {
        public static void main(String args[]) {
            //Integer intObj=Integer.valueOf(args[args.length–1]);
            /*int i = intObj.intValue();
            if(args.length> 1)
                System.out.println(i);
            if(args.length> 0)
                System.out.println(i – 1);
            else
                System.out.println(i – 2);
                */
           /* for(int i = 1; i < 3; i++)
                for(int j = 3; j > i; j--)
                    assert i!=j {System.out.println(i); } */

            HashSet<String> cars = new HashSet<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("BMW");
            cars.add("Mazda");
            System.out.println(cars);

            cars.contains("Mazda");
            System.out.println(cars.contains("Mazda"));
            cars.remove("Volvo");
            System.out.println(cars);
            cars.clear();
            System.out.println(cars);
            System.out.println(cars.size());
        }
            }



