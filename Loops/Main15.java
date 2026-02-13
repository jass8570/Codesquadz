/*
Hour glass pattern...
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********


*/




public class Main15 {
    public static void main(String[] args) {
        

        System.out.print("Enter number of rows (odd number): ");
        int n = new java.util.Scanner(System.in).nextInt();

        
        for (int i = n; i >= 1; i -= 2) {
            int spaces = (n - i) / 2;
            for (int s = 0; s < spaces; s++)
                System.out.print(" ");

            for (int star = 0; star < i; star++)
                System.out.print("*");

            System.out.println();
        }

       
        for (int i = 3; i <= n; i += 2) {
            int spaces = (n - i) / 2;
            for (int s = 0; s < spaces; s++)
                System.out.print(" ");

            for (int star = 0; star < i; star++)
                System.out.print("*");

            System.out.println();
        }
    }
}


