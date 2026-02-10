public class do_while_table {
    public static void main(String... s) {
        int i=1;
        int number;
        System.out.print("Enter the number:");
        number=new java.util.Scanner(System.in).nextInt();
        do{
            System.out.println(number+" * "+ i +" = "+ number*i);
            i++;
        }while(i<=10);
    }
}
