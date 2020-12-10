import java.util.Scanner;

public class pr29 {
    
public static void main(String[] args) {
    System.out.println("Enter the number ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(nextPrime(a));
        in.close();
}
    public static int nextPrime(int number)
	{
		while(true)
		{
			boolean notPrime = false;
			for(int i = 2; i < number; i++)
			{
				if(number % i == 0)
				{
					notPrime = true;
				}
			}
			if(!notPrime)
			{
				break;
			}
			number++;
		}
		return number;
	}
}
