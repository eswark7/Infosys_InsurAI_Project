public class ArrayJava{
    public static void main(String[] args) {
        int[] num = {3,5,8,3,6};
        String[] cars = {"Nano","Benz","Audi","BMW"};
        System.out.println(num[2]);
        System.out.println(cars[1]);

        cars[1]="Mercedes";

        System.out.println(cars[1]);

        System.out.println(cars.length);

        System.out.println("For Loop ");

        for(int i=0;i< cars.length;i++){
            System.out.println(cars[i]);
        }
        System.out.println("For - Each Loop ");

        for(String i : cars){
            System.out.println(i);
        }

    }
}