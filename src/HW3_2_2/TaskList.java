package HW3_2_2;
import java.util.HashMap;
public class TaskList {
    public static void Task () {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        for (int i = 0; i <= 10; i++) {
            integerStringHashMap.put(i, "str" + Integer.toString(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(" " + integerStringHashMap.get(i));
        }
    }
}