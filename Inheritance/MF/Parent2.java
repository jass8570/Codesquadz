public class Parent2 {
    Parent2 show(){
        System.out.println("Parent Class");
        return new Parent2();
    }
}
class child2 extends Parent2{

   child2 show(){
    System.out.println("Child Class");
    super.show();
    return new child2();
   }
   public static void main(String[] args) {
       child2 c2 = new child2();
       c2.show();
    
   }
    
}
