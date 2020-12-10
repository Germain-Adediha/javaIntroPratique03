import java.util.Scanner;
public class pr28 {
    public static void main(String[] args) {
        System.out.println("Enter the sequence");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
       System.out.print(longestZero(a));
        in.close();
    }

    public static String longestZero(String seq)
	{
		String zeros = ""; 
		String max = "";
		for(int i = 0; i < seq.length(); i++)
		{
			if(seq.charAt(i) == '0')
			{
				zeros += "0";
			}
			if(seq.charAt(i) == '1')
			{
				if(zeros.length() > max.length())
				{
					max = zeros.substring(0);
				}
				zeros = "";
			}
		}
		if(zeros.length() > max.length())
		{
			max = zeros.substring(0);
		}
		return max;
	}
}
