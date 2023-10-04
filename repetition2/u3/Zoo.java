package u3;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Fox(),
            new Elephant(),
            new Dolphin()
        };

        // bra lösning
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
        }

        // ok lösning
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
            animals[i].eat();
        }

        // dålig lösning
        animals[0].makeSound();
        animals[0].eat();
        animals[1].makeSound();
        animals[1].eat();
        animals[2].makeSound();
        animals[2].eat();
    }
}
