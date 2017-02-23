public class Student extends Person
{
    static public int grade = 10;

    public Student(int age, int g)
    {
        super(age);
        grade = g;
        System.out.println("Student Constructor");
    }
    public int getGrade()
    {
        return grade;
    }
    public void showData()
    {
        System.out.println("Student's Grade is " + grade);
        System.out.println("Student's Age is " + age);
    }
    public static void main(String[]args)
    {
        Student tom = new Student(10, 90);
        Person sue = new Person();
        tom.showData();
    }
}