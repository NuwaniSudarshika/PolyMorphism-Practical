public class Sephian {
    void status(){
        System.out.println("Live object");
    }
}
class Human extends Sephian{
    void status(){
        System.out.println("Human is Live object");
    }
}
class Man extends Human{
    void status(){
        System.out.println("Man is Live object");
    }
}
class Gawesh extends Man{
    void status(){
        System.out.println("Gawesh is Live object");
    }
}class Test{
    public static void main(String[] args) {
        Sephian s = new Sephian();
        Sephian h= new Human();
        Sephian m = new Man();
        Sephian g= new Gawesh();
        s.status();
        h.status();
        m.status();
        g.status();
    }
}
