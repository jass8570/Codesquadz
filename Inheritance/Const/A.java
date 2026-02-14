public class A {

     A() {
        System.out.println("A");
    }
    
}
class B extends A{

     B(int x) {
        System.out.println(x);
    }

     B() {
        System.out.println("B");
    }
}
class C extends B{

    C() {
        super(10);
        System.out.println("C");
    }
    C(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        new C();
        // new C(10);
    }
    
}