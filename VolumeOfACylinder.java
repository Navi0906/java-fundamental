import java.util.*;
class VolumeOfACylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of cylinder : ");
		int radius = sc.nextInt();
		System.out.print("Enter the height of cylinder : ");
		int height = sc.nextInt();
		double volume = Math.PI * (radius * radius) * height;
		System.out.print("The volume of cylinder is "+volume);
	}
}