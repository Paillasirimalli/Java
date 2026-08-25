
class conditionalstatements {
    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("Example 1: You are eligible to vote.");
        }

        int number = 10;

        if (number % 2 == 0) {
            System.out.println("Example 2: The number is even.");
        } else {
            System.out.println("Example 2: The number is odd.");
        }

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Example 3: Grade A+");
        } else if (marks >= 75) {
            System.out.println("Example 3: Grade A");
        } else if (marks >= 60) {
            System.out.println("Example 3: Grade B");
        } else if (marks >= 50) {
            System.out.println("Example 3: Grade C");
        } else {
            System.out.println("Example 3: Fail");
        }
    }
}