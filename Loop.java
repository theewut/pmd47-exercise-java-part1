public class Loop {
    public static void main(String[] args) {
        //Lap6
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

        DoWhileLoop();
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

    }

    public static void BreakFor(){

    }
}
