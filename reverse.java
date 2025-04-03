import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner object = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = object.nextInt();

        int rev_num = 0;

        int last_digit =0;

        while(number>0)
        {
            last_digit = number%10;
            rev_num = (rev_num * 10) + last_digit;
            number = number/10;
        }

        System.out.println("Reversed number :" + rev_num);
    }
}