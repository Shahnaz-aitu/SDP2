package AbstractFactory;

public class CrowName implements Name{
    @Override
    public void showName() {
        System.out.println("Karkara");
    }
    @Override
    public void looks(){
        System.out.println("Crow size");
    }
}
