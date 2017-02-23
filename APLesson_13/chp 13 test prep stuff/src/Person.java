class Person
{
    public int age;


    public Person()
    {
        System.out.println("Person Constructor");
        age = 18;
    }
    public Person(int a)
    {
        System.out.println("Person Constructor2");
        age = 20;
        System.out.println(age);
    }


    public int getAge()
    {
        return age;
    }
}