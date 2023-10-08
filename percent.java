import java.util.*;
public class percent {
    public static void main(String[] args) {
        System.out.println("find the percentage of marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks out of 100 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        float marks = a+b+c+d+e;
        float percent = (marks/5);
        System.out.println("marks obtained: " +marks);
        System.out.println("percentage : " +percent+ "%");
    }
}
