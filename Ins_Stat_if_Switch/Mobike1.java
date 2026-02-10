public class Mobike1 {
    String bno ;
    String name;
    int days;
    int charge;
    void input(){
        System.out.print("Enter the bike number:");
        bno = new java.util.Scanner(System.in).nextLine();
        System.out.print("Enter customer name:");
        name = new java.util.Scanner(System.in).nextLine();
        System.out.print("Enter the no. of days:");
        days = new java.util.Scanner(System.in).nextInt();
    }
    void compute(){
        if(days<=5){
         charge=500*5;
        }
        
        else if(days>5 && days<=10)
        {
        charge = 2500+400*(days-5);
        }
        else if(days>10){
            charge=2500+2000+200*(days-10);
        }
    }
    void display(){
        System.out.print("Bike no."+"\t"+"Customer name"+"\t"+"Days"+"\t"+"Charge");
        System.out.println(" ");
        System.out.print(bno+"\t" );
        System.out.print(name+"\t");
        System.out.print(days+"\t");
        System.out.print(charge+"\t");
    }
    public static void main(String... s) {
        Mobike1 m1=new Mobike1();
        m1.input();
        m1.compute();
        m1.display();
        
    }
    

    
}
