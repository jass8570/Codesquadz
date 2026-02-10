public class ViaMethod {
    int x=getx(); //this.getx();
    int getx(){
        System.out.println(x);
        return 20;
    }
    ViaMethod(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        new ViaMethod();
    }
}
