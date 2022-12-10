package Telephone;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
class TelephoneDirectory {
    public static void main(String[] args) {
        HashMap<String, String> directory = new HashMap<>(20);
        for (int i = 0; i < 20; i++) {
            directory.put("Иванов Иван", "89605563531");
            directory.put("Сидоров Сидор", "89605553632");
            directory.put("Петров Петр", "89905593533");
            directory.put("Михайлов Михаил", "89505559534");
            directory.put("Стульев Стул", "89805563535");
            directory.put("Учебник Учебникович", "89105551536");
            directory.put("Полка Маргарита", "89005153117");
            directory.put("Красивая Света", "89905883538");
            directory.put("Физика Физич", "89075557539");
            directory.put("Экран Экранович", "89805583510");
            directory.put("Ручка Батьковна", "89705777511");
            directory.put("Надоело Вводилова", "89202552512");
            directory.put("Ночь Спатьхотелова", "89205522513");
            directory.put("Книга Умова", "8945454514");
            directory.put("Птица Птицева", "89004454515");
            directory.put("Что Такмногова", "89505555516");
            directory.put("Конец Долгожданный", "898888885317");
            directory.put("Уже Скорова", "8909999998");
            directory.put("Мышь Кошкова", "89077777719");
            directory.put("Фаталити Финалова", "8909999920");
        }
        System.out.println(directory);
    }
}