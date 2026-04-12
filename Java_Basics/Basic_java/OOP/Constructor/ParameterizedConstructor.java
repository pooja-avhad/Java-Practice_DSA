class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void output()
        {
          System.out.println("Name="+name);
          System.out.println("Age="+age);
        }
    
}
public class ParameterizedConstructor 
{
    public static void main(String[] args) 
    {
        Person p1=new Person("Pooja",21);
        p1.output();
    }
}
