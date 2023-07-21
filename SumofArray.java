import java.util.*;
import java.io.*;
class SumofArray
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the size of array: ");
        int s = sc.nextInt();
        int a[] = new int[s];
    
        for(int i=0;i<s;i++){
            System.out.println("Enter the elements: ");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println("The sum of element in array is: "+sum);
        
        
    }
}