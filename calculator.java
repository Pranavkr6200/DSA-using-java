import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int x,a,b,sum,sub,multi;
        float div;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1-4 to use calculator : ");
        x=sc.nextInt();
        System.out.println("enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
        switch (x) {
            case 1 -> {
                sum = a + b;
                System.out.println("sum = " + sum);
            }
            case 2 -> {
                sub = a - b;
                System.out.println("sub = " + sub);
            }
            case 3 -> {
                multi = a * b;
                System.out.println("multi =" + multi);
            }
            case 4 -> {
                div = a / b;
                System.out.println("div =" + div);
            }
            default -> System.out.println("wrong case");
        }



    }
}
