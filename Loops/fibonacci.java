public class fibonacci {
    public static void main(String... s) throws java.io.IOException{
        int i,n;
        int t1=0,t2=1;
        int nextTerm=t1+t2;
        System.out.print("Enter the number of terms:");
        n=new java.util.Scanner(System.in).nextInt();
        System.out.print("Fibonacci series is:"+t1+","+t2);
        for(i=3;i<=n;i++){
            System.out.print(","+nextTerm);
            t1=t2;
            t2=nextTerm;
            nextTerm=t1+t2;
            
        }
        System.out.println();
    }
}
