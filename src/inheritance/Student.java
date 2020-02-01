package inheritance;

public class Student extends Person{
    private int grade;

    public Student(String name ,int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public void walk(){
        System.out.println("Student " + getName() + " is walking!");
    }

    @Override
    public String toString () {
        return "Name " + getName() + " Grade: " + grade;
    }
}
