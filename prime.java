import java.util.*;
import java.io.*;
class PrimeNums
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int temp=0;
        for(int i=2;i<num;i++)
        {
            if(num%2==0){
                temp = temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("Prime number");
        }
        else 
        {
            System.out.println("Not a prime number");
        }
    }
}