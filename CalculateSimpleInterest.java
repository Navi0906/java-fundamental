import java.util.*;
class CalculateSimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		int principal = sc.nextInt();
		System.out.print("Enter the rate: ");
		double rate = sc.nextDouble();
		System.out.print("Enter the time: ");
		int time = sc.nextInt();
		
		double interest = (principal * rate * time) / 100;
		System.out.print("The simple interest after "+time+" years is "+interest);
	}
}