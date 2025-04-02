import java.util.*;
class Basics
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        //Left Half Pyramid
        System.out.println("Left Half Pyramid");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Downward left Half Pyramid
        System.out.println("Downward left Half Pyramid");
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Right Half Pyramid
        System.out.println("Right Half Pyramid");
        for(int i=n;i>=1;i--)
        {
            //downward left half pyramid
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("_");
            }

            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //Downward Right half pyramid
        System.out.println("Downward Right half pyramid");

        for(int i=1;i<=n;i++)
        {
            //Left Half Pyramid
            for(int j=2;j<=i;j++)
            {
                System.out.print("-");
            }

            for(int j=n; j>=i;j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
}