package Auto;
import java.util.*;

public class Day19 {
    public static void main(String[] args) throws Exception {

        List<Integer> test_array = new ArrayList<>();
        test_array.add(10);
        test_array.add(20);
//        test_array.add(30);
//        test_array.add(40);
//        test_array.add(50);

        /*Iterator<Integer> itr = test_array.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }*/



        System.out.println("\n Hash set");
        Set<Integer> test_set_array = new HashSet<>();
        test_set_array.add(10);
        test_set_array.add(20);
        test_set_array.add(30);
        System.out.println(test_set_array);
        test_set_array.add(50);
        test_set_array.add(60);
//        test_array.forEach(test_set_array::remove);
        test_set_array.removeAll(test_array);
        System.out.println(test_set_array);
        test_set_array.clear();
        System.out.println("Set after clean up \n" + test_set_array);

    }
}
