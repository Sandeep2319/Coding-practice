import java.util.*;
import java.io.*;
class ReverseArray
{
    public static void main(String args[]){
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        System.out.print("Reverse Array elements are: ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}