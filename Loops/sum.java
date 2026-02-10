public class sum {
    public static void main(String... s) throws java.io.IOException {
        int num,count,sum=0;
        System.out.print("Enter an positive integer:");
        num=new java.util.Scanner(System.in).nextInt();
        for(count=1;count<=num;++count){
            sum+=count;
        }
        System.out.println("The sum is:"+sum);
        
    }
}
