package HW3_2_22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class TaskList {
    public static void numberSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(10);
        Random random = new Random();
        while (numbers.size() < 10){
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        // numbers.removeIf(next -> next %2 != 0);
/*        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }*/
        //System.out.println(numbers);
    }

}