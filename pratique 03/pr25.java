import java.util.Scanner;
public class pr25 {
    public static void main(String[] args) {
        System.out.println("Enter the code ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
       System.out.print(isValidHexCode(a));
        in.close();
    }
   
    public static boolean isValidHexCode(String code)
	{
		if(code.length() == 7)
		{
			if(code.charAt(0) == '#')
			{
				for(int i = 1; i < code.length(); i++)
				{
					if(!Character.isDigit(code.charAt(i)))
					{
						char symbol = code.charAt(i);
						if(!Character.isLetter(symbol))
						{
							return false;
						}
						symbol = Character.toUpperCase(symbol);
						if(symbol != 'A' && symbol != 'B' && symbol != 'C' && symbol != 'D' && symbol != 'E' && symbol != 'F')
						{
							return false;
						}
					}
				}
				return true;
			}
		}
		return false;
	}
	
}
