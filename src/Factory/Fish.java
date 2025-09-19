package Factory;

public class Fish implements Animal {
    @Override
    public void eat() {
        System.out.println("Eat fish");
    }
    @Override
    public void sound(){
        System.out.println("Sound fish");
    }
    @Override
    public void looks(){
        System.out.println("Looks fish");
    }
}
