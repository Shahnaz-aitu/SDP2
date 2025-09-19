package AbstractFactory;

public class CrowType implements Type {
    @Override
    public void showType() {
        System.out.println("Crow");
    }
    @Override
    public void Size(){
        System.out.println("Crow size");
    }
}
