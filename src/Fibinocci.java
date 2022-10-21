import java.util.Scanner;

public class Fibinocci
{
        public static void main(String args[])
        {
            int a=0,b=1,c=0,count=0,n=10;
            for(int i=1;i<=n;i++)
            {
                if (n % i == 0)
                    count++;
            }
            if(count==2)
            {
                System.out.println("Entered number is prime");
            }
            else
            {
                System.out.println("entered number is not prime");
            }

        }
}

