interface Static {
    static void show(){
        System.out.println("Myy");
    }
}
class Child1 implements Static{
    public static void main(String[] args) {
        Static.show();
    }
}