//Init block will be pasted after Super doesn't matter super is in first line or anywhere else.....

public class A2 {
    {
        System.out.println("Init Block of A");
    }
    A2(){
        //super();
        //Init block here after compilation
        System.out.println("A");
    }
}
class B2 extends A2{
    {
        System.out.println("Init block of B");
    }
    B2(int x){
        //super();
        //init block will be here
        System.out.println(x);

    }
    B2(){
        //super();
        //init block will be here
        System.out.println("B");
    }
}
class C2 extends B2  {
    {
        System.out.println("Init block of C");
    }
    C2(){
        System.out.println("Before super");
        super(10);
        //init block will be here
    }
    C2(int x){
        //super();
        //init block will be here
        System.out.println(x);
    }
    public static void main(String[] args) {
        new C2();
        // new C2(10);
    }
}