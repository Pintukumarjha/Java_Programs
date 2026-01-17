import java.util.Scanner;
class Coprime
{
    public static void main(String args[])
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a=sc.nextInt();
        System.out.println("Enter the second Number:");
        int b=sc.nextInt();
        
        for(int i=2; i<=a && i<=b; i++)
        {
            if(a%i==0 && b%i==0)
            {
                flag=1;
                break;
            }
        }
        
        if(flag==1)
        {
            System.out.println("Number are Not co-prime");
        }
        else
        {
            System.out.println("Number are co-prime");
        }
        
    }
}
