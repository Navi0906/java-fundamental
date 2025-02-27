import java.util.*;
class ConvertKilometersToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance in kilometers : ");
		int kilometers = sc.nextInt();
		double miles = kilometers * 0.621371;
		System.out.print("Distance in Miles :"+miles);
	}
}