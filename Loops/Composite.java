public class Composite {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = new java.util.Scanner(System.in).nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count > 2) {
            System.out.println(num + " is a Composite Number");
        } else {
            System.out.println(num + " is NOT a Composite Number");
        }
    }
}

