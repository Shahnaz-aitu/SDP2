package Factory;

public class FishFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Fish();
    }
}
