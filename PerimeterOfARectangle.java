import java.util.*;
class PerimeterOfARectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of rectangle : ");
		int length = sc.nextInt();
		System.out.print("Enter the width of rectangle : ");
		int width = sc.nextInt();
		
		int perimeter = 2*(length+width);
		System.out.print("The perimeter of the rectangle is "+perimeter);
	}
}