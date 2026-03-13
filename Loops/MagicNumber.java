import java.util.Scanner;
//1729, 3475
public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int r=0;
        int sum=0;
        while (num>9) {  
            while (num > 0) {
                r=num%10;
                sum =sum+r;
                num = num / 10;
            }
            if (sum == 1){
                System.out.println("Magic Number");
                break;

            }
            else if(sum>1 && sum<=9){

                System.out.println("Not a Magic Number");
                break;
            }
            else{

                num=sum;
                sum=0;
                continue;
            }
        }
        
    }
}