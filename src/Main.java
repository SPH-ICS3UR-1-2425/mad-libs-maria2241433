import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Give me a noun");
		String noun = in.nextLine();
		System.out.println("Give me a number: ");
		int num1 = in.nextInt();
		in.nextLine();
		System.out.println("Give me a second noun");
		String noun2 = in.nextLine();
		System.out.println(name+" spent "+num1+ " "+noun+" on her "+noun2);

		
		System.out.println("What's your name?");
		String name1 = in.nextLine();
		System.out.println("Give me a noun");
		String noun1 = in.nextLine();
		
		
		
		
		
		
		System.out.println(name1+ "spends too much "+noun1+" "+noun2+" vidoe games");
	
	}

}
