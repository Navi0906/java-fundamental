import java.util.*;
class CalculateAverageOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int firstnumber = sc.nextInt();
		System.out.print("Enter the second number : ");
		int secondnumber = sc.nextInt();
		System.out.print("Enter the third number : ");
		int thirdnumber = sc.nextInt();
		
		double average = (firstnumber + secondnumber + thirdnumber)/3;
		System.out.print("The average is "+average);
	}
}