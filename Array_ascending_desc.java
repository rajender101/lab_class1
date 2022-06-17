import java.util.Scanner;

public class Array_ascending_desc {

	public static void main(String[] args) {
		
		desc_array();
		asc_array();
	}
	public static void asc_array() {
		int temp;
		Scanner scanner = new Scanner(System.in);
		int array[]= new int[10];
		System.out.println("enter 10 digit");
		//taking input in array
		for(int i =0;i<10;i++) {
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
					if(array[i]>array[j]) {
						temp = array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static void desc_array() {
		int temp;
		Scanner scanner = new Scanner(System.in);
		int array[]= new int[10];
		System.out.println("enter 10 digit");
		//taking input in array
		for(int i =0;i<10;i++) {
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
					if(array[i]<array[j]) {
						temp = array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(array[i]);
		}
		
	}

}
