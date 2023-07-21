import java.util.*;
import java.io.*;
class MaxElement
{
    public static void main(String args[]){
        int a[] = new int[5];
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println("The maximum element in array is: "+max);
    }
}