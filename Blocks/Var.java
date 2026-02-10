public class Var {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        var days= new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the name:");
        var name = new java.util.Scanner(System.in).nextLine();
        System.out.println(days);
        System.out.println(name);

        byte b=10;
        byte b1=20;
        var b2=b+b1;
        System.out.println(b2);

        var v1= new Var();
        System.out.println(v1);


        var ch=10;
        var z="Hello";
        var d= true;

        System.out.println(ch);
        System.out.println(z);
        System.out.println(d);


        var a=3;
        var t=9;
        var m = t/a;
        System.out.println(m);

    }
}
