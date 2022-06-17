import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a digit");
		int number=scanner.nextInt();
		int input_number= number;
		
		int temp = 0 ;
		int re = 0;
		
		while(number>0) {
			re= number%10;
			number = number/10;
			temp = (temp*10)+re;
			
		}
		if(temp==input_number) {
		System.out.println("it is Palindrom");}
		else {
			System.out.println("it is not Palindrom");
		}
	}

}
