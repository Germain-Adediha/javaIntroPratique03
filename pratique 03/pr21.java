import java.util.Scanner;
public class pr21{
public static void main(String[] args)
	{
		System.out.println("Entering the coefficient of the equation");
		Scanner in = new Scanner(System.in);

		System.out.print("a = ");
		double a = in.nextDouble();
		System.out.print("b = ");
		double b = in.nextDouble();
		System.out.print("c = ");
		double c = in.nextDouble();
System.out.println("Number of solution is " + solutions(a,b,c));
		in.close();
	}

	public static int solutions(double a , double b, double c){
double d= b*b -4*c;
if (d==0){
    return 1;
}
if (d<0){
    return 0;
}
else{
    return 2;
}

    }
}
