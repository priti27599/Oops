public class Abstraction{
    public static void main(String args[]){
    //   Horse h = new Horse();
    //   h.eat();
    //   h.walk();

    //   Chicken c = new Chicken();
    //   c.eat();
    //   c.walk();

    Horse myHorse = new Horse();
    //Animal -> Horse -> Mustang
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    Animal(){
        System.out.println("animal constructor called");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    Horse(){
        System.out.println("Horse Constructor called");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}