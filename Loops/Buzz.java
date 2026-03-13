public class Buzz {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int num = new java.util.Scanner(System.in).nextInt();

        if(num % 7 == 0 || num % 10 == 7) {
            System.out.println("Yes " + num + " is a Buzz Number");
        } else {
            System.out.println(" No "+num + " is not a Buzz Number");
        }

    }
}

