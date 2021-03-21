public class Greeting {

    public static void main(String[] args) {
        /*
        Greeting everyone
        Suggest your name, age, weigh, etc...
        */

        String name = "Ball";
        int age = 35;
        boolean isLoveCoding = true; //true=Love, false=not love
        double weigh = 103.5;
        char grade = 'A';

        System.out.println("Hello everyone");
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I weigh " + weigh + " kilograms");
        System.out.println("Do you love coding? :" + isLoveCoding);
        System.out.println("My programming grade is " + grade);
        System.out.println("-------------------------------");
        System.out.println("This is a String " + name);
        System.out.println("This is a int " + age);
        System.out.println("This is a boolean " + isLoveCoding);
        System.out.println("This is a double " + weigh);
        System.out.println("This is a char " + grade);
    }
}