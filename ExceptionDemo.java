public class ExceptionDemo {
    static void checkNumber(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        } else {
            System.out.println("Eligible");
        }
    }
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;

            int result = a / b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } finally {
            System.out.println("Finally block always executes");
		}
        try {
            checkNumber(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}