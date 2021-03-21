public class Loop {
    public static void main(String[] args) {
        //Lab6
        WhileLoop();
        //sum 1 to 10
        Sum(10);
        //modulus 1-100 %12
        Mod12(100);

        //foreach
        int[] intArray = {1,2,3,4,5};
        for (int i : intArray) {
            System.out.println("intArray :"+ i);  
        }

        //Lab7
        DoWhileLoop();
        int n = 10;
        do {
            if(n % 2 == 0){
                System.out.println("Entered number ["+n+"] is even");
            }
            n--;
        }
        while(n > 0);

        //Lab8
        BreakFor();
    }

    public static void WhileLoop(){
        int i = 0;
        while(i <= 10) {
            System.out.println("i "+ i);
            i++;
        }
    }

    public static void Sum(int n){
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.printf("the sum of %d is %d%n", n, sum);
    }

    public static void Mod12(int n){
        int i = 1;
        while(i <= n) {
            if(i % 12 == 0){
                System.out.println("number modulus 12 is " + i);
            }
            i++;
        }
    }


    public static void DoWhileLoop(){
        int counter  = 20;
        do{
            System.out.println("counter :" + counter);
            counter--;
        }while(counter > 0);
    }

    public static void BreakFor(){
        int count = 20;
        for(int i=0; i<=count; i++){
            if(i == 11){
                System.out.println("!!!!STOP!!! break when count = " + i);
                break;
            }
            System.out.println("count: " + i);
        }
    }
}
