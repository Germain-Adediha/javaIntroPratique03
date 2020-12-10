import java.util.Scanner;
public class pr23 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
System.out.println("checkPerfect ("+ a + ") -> " + checkPerfect(a) );
        in.close();
    }
    public static boolean checkPerfect(int a){
        int s=0;
        for (int i =1;i<a;i++){
            if (a%i==0){
                s=s+i;
            }

        }
        if (s==a) return true;
        else return false;
    }
}
