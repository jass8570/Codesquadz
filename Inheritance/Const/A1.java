//Via 2025 Java

class A1 {

    public A1() {
        //super()---> via compiler
        System.out.println("A");
    }
    
}
class B1 extends A1{

    public B1(int x) {
        //super()---> via compiler
        System.out.println(x);
    }

    public B1() {
        //super()---> via compiler
        System.out.println("B");
    }
    
    
}
class C1 extends B1{

    public C1() {
        System.out.println("C");
        super(10);
    }
    C1(int x){
        //super()---> via compiler
        System.out.println(x);

    }
    public static void main(String[] args) {
        new C1();
        // new C1(10);
    }
    
}