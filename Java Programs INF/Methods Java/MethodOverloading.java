class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        int a = cal.add(20, 30);                

        int b = cal.add(5, 10, 15);             
        
        double c = cal.add(12.5, 7.3);           
        System.out.println("add(int,int)       " + a);
        System.out.println("add(int,int,int)   " + b);
        System.out.println("add(double,double) " + c);
    }
}

/*
 Same name, different parameters – the compiler picks the 
 right method by looking at the number / types of arguments.
*/