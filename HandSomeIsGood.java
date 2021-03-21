public class HandSomeIsGood {
    public static void main(String[] args) {
        boolean isHandSome = false;
        int score = 75;

        //get from score only
        getScore(score, isHandSome);

        //get from score and isHandSome
        isHandSome = true;
        getScore(score, isHandSome);
    }

    public static void getScore(int score, boolean isHandSome){
        if(isHandSome){
            System.out.println("Good");
        }else{
            if(score >= 80){
                System.out.println("Good");
            }else if(score >= 50){
                System.out.println("Normal");
            }else{
                System.out.println("Fail");
            }
        }
    }
}
