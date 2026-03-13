public class HarshadNo {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int num = new java.util.Scanner(System.in).nextInt();

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number");
        } else {
            System.out.println(num + " is NOT a Harshad Number");
        }
    }
}