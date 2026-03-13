public class Neon {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int sq= n*n;
        int sum=0;
        while(sq!=0){
            int a = sq%10;
            sum+=a;
            sq/=10;
        }
        if(sum==n){
            System.out.println("It is a neon number");
        }else{
            System.out.println("It is not a neon number");
        }
    }
}
