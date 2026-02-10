public class While_table {
    public static void main(String... s) {
        int i=1;
        int number;
        System.out.print("Enter the number:");
        number=new java.util.Scanner(System.in).nextInt();
        while (i<=10) {
            System.out.println(number+" * "+ i +" = "+ number*i);
            i++;
            
        }
        
    }
}
