
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);  
        b.add(5);
        b.add(6);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(7);
        c.add(8);
        c.add(9);

        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        main.add(a);
        main.add(b);
        main.add(c);

        // Print 2D ArrayList using for  loop

        for(int i = 0; i < main.size(); i++){
            for(int j = 0; j < main.get(i).size(); j++){
                System.out.print(main.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // Print 2D ArrayList using for-each loop

        for(ArrayList<Integer> list : main){
            for(Integer element : list){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}