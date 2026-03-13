public class UglyNo {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int num = new java.util.Scanner(System.in).nextInt();
        int temp = num;
        while (temp % 2 == 0)
            temp = temp / 2;
        while (temp % 3 == 0)
            temp = temp / 3;
        while (temp % 5 == 0)
            temp = temp / 5;
        if (temp == 1)
            System.out.println(num + " is an Ugly Number");
        else
            System.out.println(num + " is NOT an Ugly Number");

    }
}

