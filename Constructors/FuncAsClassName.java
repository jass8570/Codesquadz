public class FuncAsClassName {
    FuncAsClassName(){
        System.out.println("Default");
    }
    void FuncAsClassName(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        new FuncAsClassName().FuncAsClassName();
    }
}
