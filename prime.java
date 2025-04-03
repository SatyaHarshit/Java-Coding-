import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner object  = new Scanner(System.in);
        
        boolean ans = true;

        System.out.print("Enter the number : ");
        int num = object.nextInt();

        if(num<=0) System.out.println("Number is invalid");

        else if(num==1) System.out.println(num + " Number  is Prime number");

        else
        {
            for(int i=2;i<= Math.pow(num,0.5);i++)
            {
                if(num % i == 0)
                {
                    ans  = false;
                }
            }

            if(ans == false) System.out.println(num+" Number is not prime");

            else System.out.println(num+" Number is prime");
        
        }

        
    }
}