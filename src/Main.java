import Factory.*;
import AbstractFactory.*;

public class Main {
    public static void main(String[] args) {
        BirdsFactory crowFactory = new CrowFactory();
        Name crowName = crowFactory.createName();
        crowName.showName();
        crowName.looks();

        AnimalFactory animalFactory= new DogFactory();
        Animal animal= animalFactory.createAnimal();
        animal.eat();
        animal.sound();
    }
}
