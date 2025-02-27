import java.util.Scanner;
class AddTwoNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first_number = sc.nextInt();
		System.out.print("Enter the second number: ");
		int second_number = sc.nextInt();
		System.out.print("Sum of the given two numbers is ");
		System.out.print(first_number + second_number);
	}
}