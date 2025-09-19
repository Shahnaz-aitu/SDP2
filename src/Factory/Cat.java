package Factory;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }
    public void sound() {
        System.out.println("Cat sound Mew");
    }
    public void looks() {
        System.out.println("Cat looks cute");
    }
}
