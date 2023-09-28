package youdhveerbhaiya;
import java.util.Scanner;
class StringReverse{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string that you want to reverse");
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println("The reverse of the entered string is:"+strrev(s));
		sc.close();
	}
	static String strrev(String s) {
		if(s==null || s.length()<=1) {
			return s;
		}
		return strrev(s.substring(1))+s.charAt(0);
	}
}