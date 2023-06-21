package coreJava2;
import java.util.Scanner; 
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] months = {"Jannuary", "Febuary","March","April","May","June","July","August","September","October","November","December"};
		System.out.print("Enter your month: ");
		Scanner scanner = new Scanner(System.in);
		int month_input = scanner.nextInt();
		System.out.println("The Birthday month is: "+ months[month_input-1]);
		
	}

}
