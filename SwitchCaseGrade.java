public class SwitchCaseGrade {
    public static void main(String[] args) {
        int score = 80;
        String grade = "";
        switch (score) {
        case 80:
            grade = "A";
            break;
        case 70:
            grade = "B";
            break;
        case 60:
            grade = "C";
            break;
        case 50:
            grade = "D";
            break;
        case 40:
            grade = "F";
            break;
        default:
            grade = "E";
        }

        System.out.println("Your score is " + score + ". Got a grade of " + grade);
    }
}
