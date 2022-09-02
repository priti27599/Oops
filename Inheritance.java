public class Inheritance{
    public static void main(String args[]){
    //   Fish shark = new Fish();
    //   shark.eat();
    //   shark.swin();

    // Dog dobby = new Dog();
    //   dobby.eat();
    //   dobby.legs = 4;
    //   System.out.println(dobby.legs);

    Bird moo = new Bird();
    moo.fly();
    moo.eat();
    }
}

//Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
// //1st Derived class
// class Mammal extends Animal{
//     int legs;
// }
// //2nd Derived class
// class Dog extends Mammal{
//     String bread;
// }

//Derived Class
// class Fish extends Animal{
//     int fins;

//     void swin(){
//         System.out.println("swims in water");
//     }
// }