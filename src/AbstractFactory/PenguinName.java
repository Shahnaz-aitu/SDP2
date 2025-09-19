package AbstractFactory;

public class PenguinName implements Name{
    @Override
    public void showType() {
        System.out.println("Penguin");
    }
    @Override
    public void Size(){
        System.out.println("Penguin size ...");
    }
}
