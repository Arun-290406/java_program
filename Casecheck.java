import java.util.*;
public class Casecheck
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        char cr=in.next().trim().charAt(0);
        if( cr >= 'a' && cr<= 'z')
        {
            System.out.print("Lowercase Letter is Found");
        }
        else if(cr >= 'A' && cr<='Z'){
            System.out.print("Uppercase letter is Found");
        }
        else
        {
            System.out.println("Special Character will Found");
        }

    }
}