public class CopyConst {
    int x;
    int y;
    CopyConst(int x,int y){
        this.x = x;
        this.y = y;
    }
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
    CopyConst(CopyConst z){
        this.x=z.x;
        this.y=z.y;

    }
    public static void main(String[] args) {
        CopyConst c1= new CopyConst(10,20);
        c1.show();;
        CopyConst c2 = new CopyConst(c1);
        c2.show();
    }
}
