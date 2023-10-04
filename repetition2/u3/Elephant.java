package u3;

public class Elephant implements Animal {

    @Override
    public void makeSound() {
        System.out.println("tooot!");
    }


    @Override
    public void eat() {
        System.out.println("Trees");
    }
    
}
