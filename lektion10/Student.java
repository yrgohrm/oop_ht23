public class Student extends Person {
    private String program;

    public Student(String program) {
        this.program = program;
    }

    public Student(String name, String program) {
        super(name);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public void sayHello() {
        System.out.println("Yo! " + getName() + "! fr fr");
    }
}
