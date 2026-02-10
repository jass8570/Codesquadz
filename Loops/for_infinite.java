public class for_infinite {
    public static void main(String... s) {
        
        double num, sum=0;
        for( ; ; ){
            System.out.print("Enter the number:");
            num=new java.util.Scanner(System.in).nextInt();
            if(num<0){
                break;
            }
            sum+=num;

        }
        System.out.println("The sum is:" + sum);
    }
}
