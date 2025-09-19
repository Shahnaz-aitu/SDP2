package AbstractFactory;

public class PenguinType implements Type{
    @Override
    public void showType() {
        System.out.println("Penguin");
    }
    @Override
    public void Size(){
        System.out.println("Penguin size ...");
    }
}
