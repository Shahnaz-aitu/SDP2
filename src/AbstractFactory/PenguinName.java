package AbstractFactory;

public class PenguinName implements Name{
    @Override
    public void showName() {
        System.out.println("Penguin");
    }
    @Override
    public void looks(){
        System.out.println("Penguin size ...");
    }
}
