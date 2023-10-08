import java.util.*;
public class base {

    public static void main(String[] args) {
        int a,element,position;
        System.out.println("enter the size of an array : ");
        Scanner s = new Scanner(System.in);
         a = s.nextInt();
        int[] b = new int[a];
        System.out.println("enter element of array : ");
        for(int i=0;i<a;i++){
             b[i] = s.nextInt();
        }
        System.out.println("enter the element you want to insert : ");
        int c = s.nextInt();
        b[a]=c;
        for(int i=0;i<(a+1);i++) {
            System.out.print(b[i]+" ");
        }
    }
}