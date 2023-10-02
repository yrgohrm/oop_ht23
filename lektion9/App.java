public class App {
    public static void main(String[] args) {
        aDayWithAnimal(new Dog());
        
        Cat theCat = new Cat();
        aDayWithAnimal(theCat);
        theCat.hunt();
    }

    public static void aDayWithAnimal(Animal theAnimal) {
        String food = theAnimal.food();
        System.out.println("We need to buy some " + food);

        System.out.println("Taking a walk");
        theAnimal.walk();

        System.out.println("Time for cuddling");
        theAnimal.pet();
        theAnimal.pet();
    }
}