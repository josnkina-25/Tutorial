public class Main {
    public static void main(String[] args) {

        // Task 1: upCasting and downCasting. upCasting is casting subclass object to superclass and its done automatically by the compiler
        // it is considered as safe.
        // dowCasting is casting the superclass back to a subclass and it is used to access subclass's methods that are not accessible.

//       Parent p = new Child(); // UpCasting
//       Child c  = (Child)p; // downCasting
//       c.greet();

        // Task 2: Polymorphism
        // in Polymorphism we can have methods with the same name but must have different parameters(in method overloading).
        // for run-time the method overriding must have same name, return type and parameters and use a parent class to refer to a
        // subclass

//        Animal animal = new Animal();
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//
//        animal.animalSound();
//        dog.animalSound();
//        cat.animalSound();

    // Tasks 3: Instanceof : checks if the object is an instance of a class.
        // It does a verification before the execution of downCasting.

//        System.out.println(animal instanceof Dog);
//        System.out.println(animal instanceof Cat);
//        System.out.println(animal instanceof Animal);
//        System.out.println(dog instanceof Animal);
//        System.out.println(cat instanceof Cat);
//        System.out.println(cat instanceof Animal);

    // Task 4: Abstract class: cannot be implemented method directly, u need to have a concrete method if you want implementation.
    // you use or create an instance of a concrete subclass to use its functionality

//        Shape shape = new Rectangle(50,90);
//        Shape shape1 = new Circle(96);
//        System.out.println("The area of a rectangle is " + shape.getArea());
//        System.out.println("The perimeter of a rectangle is " + shape.getPerimeter());
//        System.out.println("The area of a circle is " + shape.getArea());
//        System.out.println("The perimeter of a circle is " + shape.getPerimeter());

        //Task 5 Interface.
// In Interface you cannot create an instance directly. A class that implements an interface must use "implements" and give
        // implementations for all Abstracts methods in the interface.Interface can support multiple inheritance.

//        Vehicule v = new Car();
//        Vehicule v2 = new Bike();
//        v.start();
//        v.stop();
//        v2.start();
//        v2.stop();

    }
}