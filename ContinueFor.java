public class ContinueFor {
    public static void main(String[] args) {
        //LAb9
        for(int counter = 0; counter<=20; counter++){
            if(counter == 11){
                System.out.println("Hello**** :" + counter);
                continue;
            }
            System.out.println("counter :" + counter);
        }

        System.out.println("===============================");

        //LAb10
        for(int num = 1; num<=10; num++){
            if(num == 2)
                continue;
            System.out.println("num :" + num);
        }
    }
}
