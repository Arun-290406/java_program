import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int ans=0;

        while(num>0)
        {
            int temp=num % 10; //123435
            num=num/10;

            ans=ans*10+temp;

        }
        System.out.print(ans);
    }
}
