import java.util.*;
import java.io.*;
class Averageof
{
    public static void main(String args[]){
        int a[] = new int[5];
        int sum=0;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        avg = sum/5.0;
        System.out.println("\n Addition: "+sum+"\n Average: "+avg);
    }
}