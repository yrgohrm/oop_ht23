public class Teacher extends Person {
    

    public static void main(String[] args) {
        Teacher t = new Teacher();

        InstanceEx.doStuffWithPerson(t);
        t.sayHello();
    }

    public void sayHello() {
        System.out.println("Good day to you sir!");
    }
}
