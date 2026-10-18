package Vehicle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        vehicle v = new car("BMW", 1000, 5000, 4);
        vehicle v2 = new motorcycle("Supra", 6000, 10000, 2);

        ArrayList<vehicle> vh= new ArrayList<>();
        vh.add(v);
        vh.add(v2);


        for(vehicle vc : vh){

            if (vc instanceof car c){
                c.setSeat(20);
            }
            vc.display();
            System.out.printf("\n");
        }
    }
}
