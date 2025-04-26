import java.util.HashMap;
import java.util.List;

public class AnimalFarm {
    private final List<String> farmAnimals;

    public AnimalFarm(List<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public HashMap<Animal, Integer> countedAnimals(List<String> farmAnimals) {
        HashMap<Animal, Integer> countedAnimals = new HashMap<>();

        for (String farmAnimal : farmAnimals) {
            Animal animal;
            try {
                animal = Animal.valueOf(farmAnimal.split(" ")[0].toUpperCase());
                Integer currentNumber = countedAnimals.get(animal);
                countedAnimals.put(animal, currentNumber == null ? 1 : currentNumber + 1);
            } catch (Exception e) {
                System.out.printf("Please correct string: '%s'. Incorrect input data.%n", farmAnimal);
            }
        }

        return  countedAnimals;
    }
}
