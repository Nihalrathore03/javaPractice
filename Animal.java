import java.util.Scanner;

public class Animal {
    public void makeSound() {
        System.out.println(" The Animal Makes the sound");
    }

}

class Cat extends Animal {
    public void makeSound() {
        System.out.println(" The Cat Makes the sound Meow Meow");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println(" The Dog Makes the sound Barks");
    }
}

class Bb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice  ");
        System.out.println("1 for Dog");
        System.out.println("2 for CAt");

        int in = sc.nextInt();

        if (in == 1) {

            Dog d1 = new Dog();
            d1.makeSound();
        } else if (in == 2) {

            Cat c1 = new Cat();
            c1.makeSound();
        } else {

            System.out.println("Invalid choice made");
            Animal a1 = new Animal();
            a1.makeSound();
        }
    }
}