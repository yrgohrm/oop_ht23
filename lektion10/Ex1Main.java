public class Ex1Main {
    public static void main(String[] args) {
        Student student = new Student("Jennie Jenniesson", "Java Enterprise Utvecklare");
        
        // anropar metoden i Person
        String name = student.getName();
        System.out.println(name);

        // anropar metoden i Student
        String program = student.getProgram();
        System.out.println(program);

        student.sayHello();

        Person person = new Person("Nisse");
        person.sayHello();

        Person person2 = new Student("Lasse", "Kockprogrammet");
        person2.sayHello();

        // Student unknown = new Student("Jazzprogrammet");
        // System.out.println(unknown.getName() + " " + unknown.getProgram());
    }
}
