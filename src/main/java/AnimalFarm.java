import java.util.*;

public class AnimalFarm {
    private final ArrayList<String> farmAnimals;

    public AnimalFarm(List<String> farmAnimals) {
        if (farmAnimals == null) {
            throw new IllegalArgumentException("Farm animals list cannot be null");
        }
        this.farmAnimals = new ArrayList<>(farmAnimals);
    }

    //task 1
    public HashMap<Animal, Integer> countedAnimals() {
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

    //task 2
    public HashSet<String> uniqueNamesOfAnimals() {
        HashSet<String> uniqueNames = new HashSet<>();
        for (String farmAnimal : farmAnimals) {
            String name;
            try {
                name = farmAnimal.split(" ")[1];
                uniqueNames.add(name);
            } catch (Exception e) {
                System.out.printf("Please correct string: '%s'. Incorrect input data.%n", farmAnimal);
            }
        }
        return uniqueNames;
    }

    //task 3
    public void addAnimalToFarm(Animal animal, String name) {
        farmAnimals.add(animal.name() + " " +name);
    }

    public void addAnimalToFarm(Animal animal) {
        farmAnimals.add(animal.name() + " N");
    }

    public void addAnimalToFarm(String name) {
        farmAnimals.add(Animal.NOT_DEFINED + " " + name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String farmAnimal : farmAnimals) {
            String printFarmAnimal = farmAnimal.replace(" ", ": ");
            stringBuilder.append(printFarmAnimal).append("\n");
        }

        return stringBuilder.toString();
    }
}
