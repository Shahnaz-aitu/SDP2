package AbstractFactory;

public class CrowFactory implements BirdsFactory{
    @Override
    public Name createName() {
        return new CrowName();
    }
    @Override
    public Type createType() {
        return new CrowType();
    }
}
