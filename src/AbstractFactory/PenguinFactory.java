package AbstractFactory;

public class PenguinFactory implements BirdsFactory{
    @Override
    public Name createName() {
        return new PenguinName();
    }
    @Override
    public Type createType() {
        return new PenguinType();
    }
}
