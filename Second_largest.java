import java.util.*;
import java.io.*;
class Second_largest
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
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp = a[i];
                    a[i] =a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest element is: "+ a[1]);
    }
}