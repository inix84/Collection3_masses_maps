package HW3_2_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
Создайте Map<String, List<Integer>>.
        Заполните ее 5 элементами, где ключ — произвольное значение,
        а значение — список, состоящий из 3 случайных чисел в диапазоне от 0 до 1000.
        Преобразуйте созданную коллекцию в новую — Map<String, Integer>,
        где ключи взяты из первой коллекции, а число — сумма чисел списка.
        Выведите результат в консоль.
*/
public class TaskList {
    public static void Task() {
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        HashMap<String, Integer> listHashMap = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));
            hashMap.put("str" + Integer.toString(i), list.get(i));
            System.out.println("str" + Integer.toString(i) + " --> " + list.get(i));
            //listHashMap.put("str" + Integer.toString(i),list.get(i).get(0) + list.get(i).get(1) + list.get(i).get(2));
            int  summsGet=0;
            for (int j = 0; j < 3; j++) {
                summsGet=summsGet+list.get(i).get(j);
            }
            listHashMap.put("str" + Integer.toString(i),summsGet);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("str" + Integer.toString(i) + " --> " + listHashMap.get("str" + Integer.toString(i)));
        }
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        for (int i = 0; i <= 10; i++) {
            integerStringHashMap.put(i, "str" + Integer.toString(i));
        }
    }
}