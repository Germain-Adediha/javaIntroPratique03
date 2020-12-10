import java.util.Scanner;
public class pr24 {
    public static void main(String[] args) {
        System.out.println("Enter a string ");
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        System.out.println(swapFirstAndLast(str));
        in.close();
    }
	public static String swapFirstAndLast(String str) 
	{ 
        if (str.length() < 2) {
        str ="Incompatible";
			return str; 
    }

		// Converting the string into 
		// a character array 
		char[] ch = str.toCharArray(); 
if (ch[0]==ch[ch.length-1]){
    str ="Two's a pair";
    return str; 
}
else{
		// Swapping first and the last 
		// character of a string 
		char temp = ch[0]; 
		ch[0] = ch[ch.length - 1]; 
		ch[ch.length - 1] = temp; 

		// Converting character to 
		// string and return 
        return String.valueOf(ch); 
}
	} 

	
	





}
