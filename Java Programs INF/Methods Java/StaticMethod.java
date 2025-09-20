class Computer
{
    public static void playmusic()
    {
        System.out.println("playing Music ...");
    }

    public static String getMeAPen(int money)
    {   
        if(money >= 10){
            return "Here is Your PEN";
        }
        else{
            return "Nothing";
        }
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        // Static method called directly using class name (no object needed)
        
        Computer.playmusic();

        String str = Computer.getMeAPen(10);

        System.out.println(str);
    }
}
