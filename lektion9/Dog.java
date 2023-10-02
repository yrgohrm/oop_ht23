public class Dog implements Animal {

    @Override
    public String food() {
        return "Orien premium dog food";
    }

    @Override
    public void walk() {
        System.out.println("walking, running, walking, taking a bath in the local stream");
    }

    @Override
    public void pet() {
        System.out.println("Petting the happiest dog ever!");
    }
    
}
