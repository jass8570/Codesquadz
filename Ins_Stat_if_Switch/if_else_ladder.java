public class if_else_ladder {
    public static void main(String[] args) {
        System.out.print("Enter the marks:");
        int marks=new java.util.Scanner(System.in).nextInt();
        if(marks>75)
        {
            System.out.println("First Class");
        }
        else if(marks>65){
            System.out.println("Second class");
        }
        else if (marks>55) {
            System.out.println("Third class");
            
        }
        else{
            System.out.println("Fourth class");
        }
    }
}
