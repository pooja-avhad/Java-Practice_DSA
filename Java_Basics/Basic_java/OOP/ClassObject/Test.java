class Car
{
    String brand;
    int speed;

    void start()
    {
        System.out.println("brand +  is starting...");
    }
     void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

public class Test 
{
    public static void main(String args[])
    {
        Car c1=new Car();
         c1.brand = "BMW";
        c1.speed = 120;

        c1.start();
        c1.showDetails();

        System.out.println("-----");

        Car c2 = new Car(); // object 2
        c2.brand = "Audi";
        c2.speed = 150;

        c2.start();
        c2.showDetails();
    }
}