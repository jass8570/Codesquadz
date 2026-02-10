public class Dadaji {
    int x=80;
}
class Base1 extends Dadaji{
    int x=20;
}
class child2 extends Base1{
    int x=10; 
    void show(){
        System.out.println(x);
        System.out.println(super.x);
        System.out.println(((Dadaji)this).x); 
        System.out.println(((Base1)this).x);

    }
    public static void main(String[] args) {
        child2 c2= new child2();
        c2.show();
        System.out.println(((Dadaji)c2).x);
    }
}
