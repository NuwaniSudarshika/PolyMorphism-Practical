public class Vehicle {
    void drive(){
        System.out.println("Drive speed limit 100kmph");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Drive speed limit 150kmph");
    }
}
class RunProgramme{
    public static void main(String[] args) {
        Vehicle c=new Car();
        Vehicle v=new Vehicle();
        c.drive();
        v.drive();
    }
}
