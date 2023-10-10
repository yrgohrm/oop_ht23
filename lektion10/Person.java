public class Person {
    private String name;

    public Person() {
        this.name = "John Doe";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
