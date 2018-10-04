package e.ch3examples;
import java.util.Scanner;
public class Grade_average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//g1 is means grade 1
		
		double g1;
		double g2;
		double g3;
		double g4;
		double g5;
		double g6;
		double g7;
		double g8;
		double g9;
		double g10;
		double avg;
		double realavg;
		//prompt
		System.out.println("input all 10 grades score");
		//user types in all scores
		g1 = input.nextDouble();
		g2 = input.nextDouble();
		g3 = input.nextDouble();
		g4 = input.nextDouble();
		g5 = input.nextDouble();
		g6 = input.nextDouble();
		g7 = input.nextDouble();
		g8 = input.nextDouble();
		g9 = input.nextDouble();
		g10 = input.nextDouble();
		//calculate
		avg = g1+g2+g3+g4+g5+g6+g7+g8+g9+g10;
        realavg = avg/10;
        //if statements
        if (realavg>=90) {
        	System.out.println("Your grade is A...your avg is " +realavg);
        }
        else  if (realavg>=80) {
        	System.out.println("Your grade is B...your avg is " +realavg);
        }
        else if (realavg>=70) {
        	System.out.println("Your grade is C...your avg is " +realavg);
        }
        else if (realavg>=60) {
        	System.out.println("Your grade is D...your avg is " +realavg);
        }
        else  if (realavg>=50) {
        	System.out.println("Your grade is F...your avg is " +realavg);
        }
        else  if (realavg<=50) {
        	System.out.println("Your grade is F...your avg is " +realavg);
        }
        else
        	System.out.println("something went wrong");
        System.out.println("PROGRAM END");
	}

}
