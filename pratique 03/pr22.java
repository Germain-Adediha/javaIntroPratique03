import java.util.Scanner;


public class pr22 {
    public static void main(String[] args) {
        System.out.println("Enter a string ");
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        System.out.println(findZip(str));
        in.close();
    }

    public static int findZip(String s1)
	{
		if(s1.indexOf("zip") >= 0)
		{
			s1 = s1.substring(0, s1.indexOf("zip")) + "_" + s1.substring(s1.indexOf("zip") + 1);
			if(s1.indexOf("zip") >= 0)
			{
				return s1.indexOf("zip");
			}
		}
		return -1;
	}
}
