import java.util.Scanner;

public class pr27 {

    
public static void main(String[] args) {
    System.out.println(" Enter the number ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(isKaprekar(a));
        in.close();
}

    public static boolean isKaprekar(int number)
	{
		int left = 0, right = 0;
		if(number*number/10 == 0)
		{
			return number == number*number;
		}
		int sq = number*number, len = 0;
		while(sq > 0)
		{
			sq = sq/10;
			len++;
		}
		left = number*number/(int)Math.pow(10, len - len/2);
		right = number*number % (int)Math.pow(10, len - len/2);
		
		return number == left + right;
	}
}
