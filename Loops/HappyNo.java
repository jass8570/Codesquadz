

public class HappyNo {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = new java.util.Scanner(System.in).nextInt();

        int result = num;

        while(result != 1 && result != 4) {
            int sum = 0;

            while(result > 0) {
                int digit = result % 10;
                sum = sum + (digit * digit);
                result = result / 10;
            }

            result = sum;
        }

        if(result == 1) {
            System.out.println(num + " is a Happy Number");
        } else {
            System.out.println(num + " is not a Happy Number");
        }
    }
}
