import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем список животных
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat Tom");
        animals.add("Dog Rex");
        animals.add("Horse Spirit");
        animals.add("Cat Jerry");
        animals.add("Cow Bessie");
        animals.add("Cow Tom"); //повторение имени
        animals.add("Lion King"); //исключение для первого задания
        animals.add("Cat"); //исключение для второго задания

        // Создаем объект фермы
        AnimalFarm farm = new AnimalFarm(animals);

        // Получаем подсчитанных животных
        HashMap<Animal, Integer> countedAnimals = farm.countedAnimals();
        System.out.println(countedAnimals);

        //Получаем уникальные имена животных
        HashSet<String> uniqueNamesOfAnimals = farm.uniqueNamesOfAnimals();
        System.out.println(uniqueNamesOfAnimals);

        //Добавляем новых животных в список методом addAnimalToFarm()
        farm.addAnimalToFarm(Animal.CAT, "Tom");      // CAT Tom
        farm.addAnimalToFarm(Animal.COW, "Bessie");    // COW Bessie
        farm.addAnimalToFarm(Animal.DOG);              // DOG N
        farm.addAnimalToFarm("MysteriousCreature");    // NOT_DEFINED MysteriousCreature
        farm.addAnimalToFarm(Animal.HORSE, "Spirit");  // HORSE Spirit
        farm.addAnimalToFarm(Animal.CAT);              // CAT N

        //Вывод всех животных на ферме в переопределенном виде "Вид_животного: Имя_животного"
        System.out.println(farm);

    }
}