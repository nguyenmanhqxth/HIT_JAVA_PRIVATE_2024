public class Student extends Person {
    private int id;
    private String nameClass;
    private float gpa;
    private static final float criteria = 2.0f;

    public Student(int id, String name, int age, Address address, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public boolean checkFall() {
        return gpa < criteria;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("ID: " + id + ", Class: " + nameClass + ", GPA: " + gpa);
        System.out.println("Status: " + (checkFall() ? "Falling" : "Passing"));
    }

    public int getId() {
        return id;
    }

    public float getGpa() {
        return gpa;
    }

}
