package Factory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.sound();

        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.sound();

        AnimalFactory fishFactory = new FishFactory();
        Animal fish=fishFactory.createAnimal();
        fish.sound();
    }
}