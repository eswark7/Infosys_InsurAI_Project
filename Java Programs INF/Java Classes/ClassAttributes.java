public class ClassAttributes {
    int x = 20;
    int y = 30;
    final int z = 100;

    public static void main(String[] args) {
        ClassAttributes myObj = new ClassAttributes();
        System.out.println(myObj.x);
        System.out.println(myObj.y);  

        System.out.println("Modify Attributes");
            myObj.x = 40;
            myObj.y = 50;
        System.out.println(myObj.x);
        System.out.println(myObj.y); 
        
            //myObj.z=1000;
        System.out.println(myObj.z);
    }
}

/*
Attributes (also called fields or variables) are used to store data inside a class.

 The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
*/