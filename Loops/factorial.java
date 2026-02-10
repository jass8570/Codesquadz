public class factorial {
    public static void main(String[] args) {
        int number;
        int fact=1;
        System.out.print("Enter the number:");
        number=new java.util.Scanner(System.in).nextInt();
        for(int i=1;i<=number;++i){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
