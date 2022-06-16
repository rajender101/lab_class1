import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		System.out.println("enter a digit on which you want to end fibonnaci");
		Scanner scanner = new Scanner(System.in);
		int digit =scanner.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		int sum;
		for(int i=1;i<digit-1;i++) {
			sum = a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}
		
	}

}
