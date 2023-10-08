import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        int n, sumE = 0, sumO = 0, evenAvg,oddAvg, evencount = 0, oddcount = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
                 evencount++;
            }
            else
            {
                sumO = sumO + a[i];
                oddcount++;
            }
        }
        evenAvg=sumE/evencount;
        oddAvg=sumO/oddcount;
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("avg of Even Numbers:"+ evenAvg);
        System.out.println("Sum of Odd Numbers:"+sumO);
        System.out.println("avg of Odd Numbers:"+ oddAvg);
    }
}
