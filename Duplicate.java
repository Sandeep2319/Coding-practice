import java.util.*;
import java.io.*;
class Duplicate
{
    public static void main(String args[])
    {
        int temp;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s = sc.nextInt();
        
        int a[] = new int[s];
    
    
        System.out.println("Enter the elements: ");
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Duplicate elements are: ");
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                   System.out.println(a[j]+" "); 
                }
            }
        }
    }
}