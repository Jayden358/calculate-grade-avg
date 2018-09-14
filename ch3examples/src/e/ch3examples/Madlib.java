package e.ch3examples;
//Jayden Williams
//9/18

import java.util.Scanner;

public class Madlib {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String noun1;
		String noun2;
		String celebrity1;
		String noun3;
		String celebrity2;
		String aplace;
		String noun4;
		String sillyword;
		String pluralnoun1;
		String typeofliquid;
		String partofthebody;
		String pluralnoun2;
		//user instructions prompt
		//PLUS inputs
		System.out.println("Fill in the madlib...");
		System.out.println("noun1");
		noun1 = input.nextLine();
		System.out.println("noun2");
		noun2 = input.nextLine();
		System.out.println("celebrity1");
		celebrity1 = input.nextLine();
		System.out.println("noun3");
		noun3 = input.nextLine();
		System.out.println("celebrity2");
		celebrity2 = input.nextLine();
		System.out.println("aplace");
		aplace = input.nextLine();
		System.out.println("noun4");
		noun4 = input.nextLine();
		System.out.println("sillyword");
		sillyword = input.nextLine();
		System.out.println("pluralnoun1");
		pluralnoun1 = input.nextLine();
		System.out.println("type of liquid");
		typeofliquid = input.nextLine();
		System.out.println("Part of the body");
		partofthebody = input.nextLine();
		System.out.println("Pluralnoun2");
		pluralnoun2 = input.nextLine();
		//story
		System.out.println("In 356 B.C., Phillip of Macedonia, the ruler of a province in northern\r\n" + 
				"Greece, became the father of a bouncing baby "+noun1+"\r\n"+
				"named Alexander. Alexander's teacher was Aristotle, the famous\r\n " + 
				noun2+". When he was twenty years old, his father was murdered\r\n" + 
				"by "+celebrity1+", after which he became "+noun3+" of all\r\n" + 
				"Macedonia. In 334, he invaded Persia and defeated "+celebrity2+"\r\n" + 
				"at the battle of "+aplace+". Later, at Arbela, he won his most\r\n" + 
				"important victory, over Darius the Third. This made him "+noun4+" \r\n" + 
				""+sillyword+".over all Persians. Then he marched to India, and\r\n" + 
				"many of his "+pluralnoun1+" died. After that, Alexander began\r\n" + 
				"drinking too much "+typeofliquid+", and at the age of 33, he died\r\n" + 
				"of an infection in the "+partofthebody+". His last words are reported\r\n" + 
				"to have been, \"There are no more "+pluralnoun2+" to conquer.\"\r\n" + 
				"");
	}

}
