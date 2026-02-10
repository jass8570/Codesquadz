public class Nested_if {
    public static void main(String[] args) {
        System.out.print("Enter the first number:");
        int num1=new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the second number:");
        int num2=new java.util.Scanner(System.in).nextInt();
        if(num1>=num2){
            if(num1==num2){
                System.out.println("The result is:"+ num1+"=="+num2);
            }
            else{
                System.out.println("The result is:"+num1+">"+num2);
            }
        }
        else{
            System.out.println("The result is:"+num1+"<"+num2);
        }
    }
}
