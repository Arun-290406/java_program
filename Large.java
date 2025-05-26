import java.util.*;
public class Large
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        /* if(a>b & a>c)
        {
            System.out.print(a+"is a greatest of these three number");
        }
        else if(b>c & b>a)
        {
            System.out.print(b+"is a greatest of these three number");
        }
        else
        {
            System.out.print(c+"is a greatest of these three number");
        }*/
        
        System.out.println(Math.max(c,Math.max(a,b)));
           
    }
    
}