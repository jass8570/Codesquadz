public class while_infine {
    public static void main(String... s) {
        double number,sum=0.0;
        while (true) {
            System.out.print("Enter the number:");
            number=new java.util.Scanner(System.in).nextInt();
            if(number<0.0){
                break;
            }
            sum+=number;
        }
        System.out.println("The sum of numbers are:"+sum);
    }
}
