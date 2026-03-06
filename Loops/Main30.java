public class Main30 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                if(i%2!=0)
                System.out.print("*");
                else
                System.out.print("-");
            }

            System.out.println();
        }
        for (int i = 5 - 1; i >= 1; i--) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                if(i%2!=0)
                System.out.print("*");
                else
                System.out.print("-");
            }

            System.out.println();
        }
    }
}
