public class InstanceEx {
    public static void main(String[] args) {
        
        Person person = new Person("Nisse"); 
        Student student = new Student("JEU");

        doStuffWithPerson(person);
        doStuffWithPerson(student);
    }

    public static void doStuffWithPerson(Person p) {
        if (p instanceof Student s) {
            // Student s = (Student) p;
            System.out.println("Det är en student");
            s.getProgram();
        }
        else if (p instanceof Teacher) {
            System.out.println("p is a teacher");
        }
        else if (p instanceof Person) {
            System.out.println("p är en person");
        }

    }
}
