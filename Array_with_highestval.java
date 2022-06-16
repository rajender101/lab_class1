import java.util.Scanner;

public class Array_with_highestval {

	public static void main(String[] args) {
		findarray();

	}
	public static void findarray(){
	int temp = 0;
	int newarray[]= new int[10];
	System.out.println("enter 10 number in the array");
	Scanner scanner = new Scanner(System.in);
	for (int i=0;i<10;i++) {
		
		newarray[i]=scanner.nextInt();
	}
	System.out.println("the numbers are ");
	for (int i=1;i<10;i++) {
		temp = newarray[0];
		if(temp < newarray[i]) {
			temp = newarray[i];
		}
		System.out.println("numbers of array are:- "+newarray[i]);
		
	}
	System.out.println("hightest number is "+temp);	
	}
	}
