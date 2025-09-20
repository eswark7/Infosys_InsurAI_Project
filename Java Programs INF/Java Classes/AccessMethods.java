public class AccessMethods {


    public void ringBell() {
        System.out.println("Ring! Ring! The bicycle bell is ringing!");
    }

    public void changeGear(int newGear) {
        System.out.println("Shifting to gear: " + newGear);
    }


    public static void main(String[] args) {
        AccessMethods myBike = new AccessMethods(); 
        myBike.ringBell();               
        myBike.changeGear(3);          
    }
}
