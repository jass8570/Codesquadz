public class PvtDM {
    private int x=10;
    void show(){
        System.out.println(x);
    }
}

class child1 extends PvtDM{
    public static void main(String[] args) {
        child1 c1= new child1();
        c1.show();
    }
}