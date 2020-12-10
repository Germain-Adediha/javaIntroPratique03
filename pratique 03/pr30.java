import java.util.Scanner;

public class pr30 {
   public static void main(String[] args) {
    System.out.println("Enter a numbers ");
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    System.out.println(rightTriangle(a, b, c));
    in.close();
   }
    
    public static boolean rightTriangle(int x, int y, int z)
	{
		return (x*x + y*y == z*z) || (x*x + z*z == y*y) || (y*y + z*z == x*x);
	}
}
