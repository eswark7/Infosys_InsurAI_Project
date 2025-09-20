public class Constructors {
    int speed;

    // 1️⃣ No‑parameter constructor

    public Constructors() {
        this(100);
    }

    //2️⃣ Constructor with a parameter
    
    public Constructors(int maxSpeed) {
        speed = maxSpeed;
    }

    public static void main(String[] args) {
        Constructors defaultCar = new Constructors();
       Constructors fastCar = new Constructors(200);

        System.out.println("Default car speed: " + defaultCar.speed);
        System.out.println("Fast car speed: " + fastCar.speed);
    }
}

/*
 A constructor is a special block of code in a class that 
 runs automatically when you create an object using new.

It is used to give initial values to variables in the object.
 */