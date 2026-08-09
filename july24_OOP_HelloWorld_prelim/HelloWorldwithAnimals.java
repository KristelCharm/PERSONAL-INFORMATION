class Dog {
    public void sayHello() {
        System.out.println("Arf! Arf! Arf!");
    }
}

class Cat {
    public void sayHello() {
        System.out.println("Meow! Meow");
    }
}

class Duck {
    public void sayHello() {
        System.out.println("Quack! Quack!");
    }
}

public class HelloWorldwithAnimals {
    public static void main(String[] args) {

        Dog animal1 = new Dog();
        Cat animal2 = new Cat();
        Duck animal3 = new Duck();
        
        animal1.sayHello();
        animal2.sayHello();
        animal3.sayHello();
    }
}