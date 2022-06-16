import java.util.*;
public class Funtion_with_all_operator {
	
	

	public static void main(String[] args) {
		airthmetic(5,4);
		logic(5,4,3);
		
		
		
	}
	
	public static int airthmetic(int a,int b) {
		System.out.println("enter 1 for ADD',2 for 'Subtract', 3 for multiply, 4 for 'division'");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		int answer =0;
		switch(choice) {
		case 1:
			answer=a+b;
			System.out.println(answer);
			break;
		case 2:
			answer=a-b;
			System.out.println(answer);
			break;
		case 3:
			answer=a*b;
			System.out.println(answer);
			break;
		case 4:
			answer=a/b;
			System.out.println(answer);
			break;
		default: System.out.println("incorrect choice, please try again");
		}
		return answer;
	}
		public static void logic(int a, int b,int c) {
			if(a>b||a>c) {System.out.println("a is greatest");}
			else if(b>a||b>c) {System.out.println("b is greatest");}
			else {System.out.println("c is greatest");}
		}
	
	

}
