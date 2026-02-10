public class Initt {
    int x;
    {
        System.out.println("INIT BLOCK");
        x=20;
    }
    Initt(){
        System.out.println("Default");
        System.out.println(x);
    }
    Initt(int x){
        System.out.println(x);
    }
    {
        System.out.println("Second Block");
    }
    public static void main(String[] args) {
        new Initt();
        new Initt(10);
        new Initt();
    }
}
