class Calculator{
    public static int add(int n1,int n2)
    {
        int r= n1 + n2;
        return r;
    }
}

public class Demo {
    public static void main(String[] args) {
        
        int num1 =2;
        int num2 = 4;

        //Calculator cal = new Calculator();

        //int result = cal.add(num1,num2);

        int result = Calculator.add(num1,num2);

        System.out.println(result);

    }
}

/*
Static vs. Public
we created a static method, which means that it can be 
accessed without creating an object of the class, unlike 
public, which can only be accessed by objects

*/