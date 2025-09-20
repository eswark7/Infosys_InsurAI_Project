public class StringMethods {
    public static void main(String[] args) {

        String name = "Eswar war";
        String password = "Eswar war";
        String email="eswark1150@gmail.com";

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(1);
        System.out.println(letter);

        int index = name.indexOf('a'); //returns the first occurrence of 'a', which is at index 3.
        System.out.println(index);

        int lastindex = name.lastIndexOf('a');// gives the last occurrence of 'a', which is at index 7.
        System.out.println(lastindex);
        
        String Username = email.substring(0,6);
        System.out.println("UserName :"+Username);

        //name=name.toUpperCase(); // Convert to uppercase
        //name=name.toLowerCase(); // Convert to lowercase
        //name =name.trim(); // Removes spaces from beginning and end
        //name = name.replace("a","p"); // Replaces all 'a' with 'p'
        System.out.println(name);
        System.out.println(name.isEmpty());

        if(name.equals(password)){
            System.out.println("both name and password are same");
        }
        else{
            System.out.println("Both are not same")  ;
        }
    }
}