class Person
{
    String name;
    int age;

    Person()
    {
        name="Pooja";
        age=21;
    }
    void output()
    {
        System.out.println("Name="+name);
        System.out.print("Age="+age);
    }
}
public class NonParameterizedConstructor 
{
    public static void main(String[] args) 
    {
        Person p1=new Person();
        p1.output();
    }
}
