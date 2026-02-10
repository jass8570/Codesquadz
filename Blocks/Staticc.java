class Staticc {
    static int x;
    static{
        System.out.println("Static block");
        x=new java.util.Scanner(System.in).nextInt();
    }
    // public static void main(String[] args) {
    // System.out.println(x);
    // }
}

class StaticTest1{
    public static void main(String[] args) {
        System.out.println("Main from test one");
        System.out.println(Staticc.x);

        System.out.println("After the static block from test one");
    }
}

class StaticTest2{
    public static void main(String[] args) {

        System.out.println("Main from test two");
        System.out.println(Staticc.x);

        System.out.println("After the static block from test 2");
        
    }

    
}
