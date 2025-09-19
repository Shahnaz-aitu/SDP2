package AbstractFactory;

public class CrowName implements Name{
    @Override
    public void showType() {
        System.out.println("Crow");
    }
    @Override
    public void Size(){
        System.out.println("Crow size");
    }
}
