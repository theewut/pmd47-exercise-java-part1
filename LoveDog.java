public class LoveDog {
    public static void main(String[] args) {
        //call method
        bark();

        //primitive
        float myFloat = 2.5f;
        int myInt = 1;
        double myDouble = 3.00;
        char myChar = 'A';

        //final variable
        final String hello = "Hello";

        System.out.println("myFloat value : " + myFloat);
        System.out.println("float > int : " + (int) myFloat);

        System.out.println("myInt value : " + myInt);
        System.out.println("int > float : " + (float) myInt);

        System.out.println("myDouble value : " + myDouble);
        System.out.println("double > float : " + (double) myDouble);

        System.out.println("myChar value : " + myChar);
        System.out.println("char > int : " + (int) myChar);

        System.out.println("final variable value : " + hello);
        /*
        java.lang.Error: Unresolved compilation problem: 
        The final local variable hello cannot be assigned. It must be blank and not using a compound assignment
        */

        //hello = "World";
        //System.out.println("assign new value : " + hello);
    }

    public static void bark(){
        String dogName = "Bobby";
        System.out.println("The Dog name = " + dogName + " bark");
    }
}
