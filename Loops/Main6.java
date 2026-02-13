/*
Diamond Pattern.....
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/

public class Main6{
    public static void main(String[] args) {

    

        // Upper half
        for (int i = 1; i <= 5; i++) {

            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 5 - 1; i >= 1; i--) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
