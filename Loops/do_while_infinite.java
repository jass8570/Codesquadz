public class do_while_infinite {
    public static void main(String... s) {
        int i=1;
        int number, sum=0;
        
        do{
            System.out.print("Enter the number:");
        number=new java.util.Scanner(System.in).nextInt();
        if(number<0){
            break;
        }
            sum+=number;
        }while(true);
        System.out.println("The sum is:"+sum);
        
    }
}
