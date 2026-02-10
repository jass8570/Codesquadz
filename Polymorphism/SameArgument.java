public class SameArgument {
    static void show(int x,long f)
    {
        System.out.println("Int long argument");
    }
    static void show(long x,int z)
    {
        System.out.println("Long int arguments");
    }
    public static void main(String[] args) {
        show(10, 10l);
        show(10l, 10);
        // show(10,10);
    }
}
