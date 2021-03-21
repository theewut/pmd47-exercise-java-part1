public class PrefixSuffixConditional {
    public static void main(String[] args) {
        //Prefix -Suffix
        int i = 20;
        i++;
        i++;
        i++;
        i++;
        i++;
        System.out.println(i);
        --i;
        --i;
        --i;
        --i;
        --i;
        System.out.println(i);

        //Conditional 
        float myFloat = 2.0f;
        char mychar = 'A';

        if((myFloat >= 1) && (myFloat <= 5)){
            System.out.println("myFloat bewteen 1 to 5");
        }
        if((mychar == 'A') || (mychar == 'B')){
            System.out.println("mychar is 'A' OR mychar is 'B'");
        }
    }
}
