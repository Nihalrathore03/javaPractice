abstract public class Vehicle {
    abstract void  drive();

}

/**
 * Vehicle
 */
class Car extends Vehicle{
@Override
void drive() {
    // TODO Auto-generated method stub
    System.out.println("runs on the 4 wheels");
    
}
    
}

class Motor extends Vehicle{   
    @Override
void drive() {
    // TODO Auto-generated method stub
    System.out.println("runs on the 2 wheels");
    
    
}
}
/**
 * InnerVehicle
 */
class InnerVehicle {

    public static void main(String[] args) {
        Car c1 =new Car();
        Motor m1 = new Motor();
        c1.drive();
        m1.drive();
    }
}