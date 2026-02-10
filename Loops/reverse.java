public class reverse {
    public static void main(String[] args) {
        int rev=0;
        int z;
        while (true) {
            System.out.print("Enter the value:");
            int x1=new java.util.Scanner(System.in).nextInt();
            while (x1>0) {
                z=x1%10;
                x1=x1/10;
                rev=rev*10+z;
            }
            System.out.println(rev);
            rev=0;
            System.out.println("Do you want to continue... Press 1 for Yes and 0 for No");
            int x2= new java.util.Scanner(System.in).nextInt();
            if(x2==1)
            continue;
            else
            break;
        }
    }
}
