import java.util.Scanner;
class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in Celsius: ");
		int Celsius = sc.nextInt();
		int ToFahrenheit = (Celsius * 9/5) + 32;
		System.out.print("The temperature in Fahrenheit is " +ToFahrenheit);
	}
}