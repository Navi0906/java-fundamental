import java.util.*;
class PowerCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base value : ");
		int base = sc.nextInt();
		System.out.print("Enter the exponent value : ");
		int exponent = sc.nextInt();
		
		double result = Math.pow(base,exponent);
		System.out.print("Answer : "+result);
	}
}