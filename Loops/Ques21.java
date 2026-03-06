public class Ques21 {
    public static void main(String[] args) {

        int s, l, sum = 0;

        System.out.print("Enter the initial number: ");
        s = new java.util.Scanner(System.in).nextInt();
        
        System.out.print("Enter the last number: ");
        l = new java.util.Scanner(System.in).nextInt();
        

        for(int i = s; i <= l; i++) {
            if(i % 3 == 0 || i % 4 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
