public class MyGrage {
    public static void main(String[] args) {
        int[] scoreArry = {10,8,7,7,8,7,6,9,10,8};
        int scoreSum = SumScore(scoreArry);
        System.out.println("Your score is " + scoreSum);
        displayGrade(scoreSum);
    }

    public static int SumScore(int[] intArry){
        int sum = 0;
        for (int i : intArry) {
            sum = sum + i;
        }
        return sum;
    }

    public static void displayGrade(int score){
        if(score >= 80){
            System.out.println("Your Grade is: A");
        }else if(score >= 70){
            System.out.println("Your Grade is: B");
        }else if(score >= 60){
            System.out.println("Your Grade is: C");
        }else if(score >= 50){
            System.out.println("Your Grade is: D");
        }else{
            System.out.println("Your Grade is: F");
        }
    }
}
