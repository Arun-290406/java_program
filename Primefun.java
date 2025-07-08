import java.util.Scanner;

public class Primefun
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt(); 
        System.out.println(isprime(n));
    }

    static boolean isprime(int n)
    {
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n)
        {
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
    
}
