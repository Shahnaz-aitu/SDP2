package Factory;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat meat");
    }
    @Override
    public void looks() {
        System.out.println("Dog looks funny");
    }
    @Override
    public void sound(){
        System.out.println("Dog sound Woof");
    }
}

