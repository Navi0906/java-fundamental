import java.util.*;
class AreaOfACircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of circle : ");
		int radius = sc.nextInt();
		double area = Math.PI * radius*radius;
		System.out.print("The area of the circle is " +area);
	}
}