import java.util.*;

class Square_pattern
{
    public static void pattern_1(int num)
    {
        /*
                    ABC
                    ABC
                    ABC
        */

        for(int i=0;i<num;i++) // Number of times outer loops runs
        {
            char ch = 'A';

            for(int j=0;j<num;j++)
            {
                System.out.print(ch);
                ch+=1;
            }
            System.out.println();
        }
    }


    public static void pattern_2(int num)
    {
        /*
          123
          456
          789
        */

        int number = 1;

        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }


    public static void main(String args[])
    {
        // Square Pattern
        Scanner object = new Scanner(System.in);

        System.out.print("Enter the Number: ");

        int num = object.nextInt();

        pattern_2(num);
    }
}