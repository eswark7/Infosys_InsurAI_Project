class Computer
{
    public void playmusic()
    {
        System.out.println("playing Music ...");
    }

    public String getMeAPen(int money)
    {   
        if(money >= 10){
            return "Here is Your PEN";
        }
        else{
            return "Nothing";
        }
    }
}

public class MethodTest{
    public static void main(String[] args) {

        Computer com = new Computer();

        com.playmusic();

        String str = com.getMeAPen(10);
        
        System.out.println(str);
        
    }
}
/*

A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.

*/