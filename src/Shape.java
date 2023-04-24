public class Shape {
    void area(){
    }
}
class Triangle extends Shape{
    void area(){
        System.out.println("Triangle area:- 1/2+base+height");
    }
}
class Circle extends Shape{
    void area(){
        System.out.println("Circle area:-3.14*radius*radius");
    }
}
class Run{
    public static void main(String[] args) {
        Shape t= new Triangle();
        Shape c=new Circle();
        t.area();
        c.area();
    }
}
