import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int  res=0;
        while (true)
        {
            System.out.print("Enter the Operator:");
            char cr=in.next().trim().charAt(0);

            if(cr == '+' ||cr == '-' ||cr == '*' ||cr == '/' ||cr == '%')
            {
                System.out.print("Enter the Two number:");
                int a=in.nextInt();
                int b=in.nextInt();
                if(cr == '+')
                {
                    res=a+b;
                }
                else if(cr == '-')
                {
                    res=a-b;
                }
                else if(cr == '*')
                {
                    res=a*b;
                }
                else if(b != 0)
                {
                    if(cr == '/')
                    {
                        res=a/b;
                    }
                    else{
                        System.out.println("Invalid input");
                    }
                }
                else if(b != 0)
                {
                    if(cr == '%')
                    {
                        res=a%b;
                    }
                    else{
                        System.out.println("Invalid input");
                    }
                }
                else
                {
                    System.out.println("Invalid operator");
                }
                
                System.out.println("Output: "+res);

            }
        }
    }
}
