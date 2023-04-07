package programme23_methodoverriding;

public class Bike extends Vehicle{

    //defining the same method as int he parent class
    public void run(){
        System.out.println("Bike is running safely.");
    }
public static void main(String [] args){
        Bike obj = new Bike();  // obj creation
        obj.run();  // method calling
}
}
