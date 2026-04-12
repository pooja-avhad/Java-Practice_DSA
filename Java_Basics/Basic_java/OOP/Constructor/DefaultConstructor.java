class Person
{
    String name;
    int age;
    void output()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }
}
public class DefaultConstructor
{
    public static void main(String[] args) 
    {
        Person p1=new Person();
        p1.output();
    }
}