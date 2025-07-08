import java.util.Scanner;

public class Retfun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name1=sc.nextLine();
        String person=name(name1);
        System.out.println(person);


        
    }

    static String name(String name1){
        String hi ="Hello "+name1;
        return hi;
    }

    static int Hm(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        return a;

    }
    static String Hm2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String greet=sc.nextLine();
        return greet;
    }

    static int Hm3(int a,int b,int c){
        int sum=a+b+c;
        return(sum);
    }
    
}
