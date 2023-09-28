package youdhveerbhaiya;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String arg[]) {
			Fibonacci x=new Fibonacci();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the maximum number to print the fibonacci series : 1");
			int number=sc.nextInt();
			
			for(int i=0;i<number;i++) {
				System.out.print(x.fib(i) +" ");
			}
			sc.close();
	}
	int fib(int y) {
		if(y==0 || y==1) {
			return y;
		}
		else {
			return fib(y-1)+fib(y-2);
		}
	}
}