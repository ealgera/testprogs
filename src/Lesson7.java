import java.util.Scanner;

public class Lesson7 {
	public static void main(String args[]) {
		double fNum, sNum, aNum;
		Scanner myInput = new Scanner(System.in); 
		
		System.out.println("Geef het eerste nummer   : ");
		fNum = myInput.nextDouble();
		System.out.println("Geef het volgende nummer : ");
		sNum = myInput.nextDouble();
		aNum = fNum + sNum;
		System.out.println("Twee getallen opgeteld is: " + aNum );
	}
}
