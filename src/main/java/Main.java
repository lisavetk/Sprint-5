import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список животных
        List<String> animals = List.of(
                "Cat Tom",
                "Dog Rex",
                "Horse Spirit",
                "Cat Jerry",
                "Cow Bessie",
                "Lion King" // Это неправильное животное, будет ошибка
        );
        // Создаем объект фермы
        AnimalFarm farm = new AnimalFarm(animals);

        // Получаем подсчитанных животных
        HashMap<Animal, Integer> counted = farm.countedAnimals(animals);

        // Выводим результат
        for (HashMap.Entry<Animal, Integer> entry : counted.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}