import java.util.Scanner;
class Main
{
public static void main(String args[])
    {
        int n; // Number of prime numbers we expect from program
        int status = 1;
        int num = 3;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the value of n::");
        n = sc1.nextInt(); // store the integer value into n
        if (n >= 1)
        {
            System.out.println("First " + n + " Prime numbers are ::");
            System.out.println(2);
        }
        for (int i = 2; i <= n;)
        {
            for (int j = 2; j <= Math.sqrt(num); j++)
            {
                if (num % j == 0)
                {
                    status = 0;
                    break;
                }
            }
            if (status != 0)
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}