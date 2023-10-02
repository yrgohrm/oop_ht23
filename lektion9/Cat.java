public class Cat implements Animal {

    @Override
    public String food() {
        return "the finest tuna";
    }

    @Override
    public void walk() {
        System.out.println("the cat will take a walk by itself, thank you very much");
    }

    @Override
    public void pet() {
        System.out.println("The cat viciously bites your hands");
    }
    
    public void hunt() {
        System.out.println("hunting mice");
    }
}
