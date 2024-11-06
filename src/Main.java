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
		
		
//		System.out.println(name+" spent "+num1+ " "+noun+" on her "+noun2);

		Scanner in = new Scanner(System.in);
		System.out.println("What's your name?");
		String name1 = in.nextLine();
		System.out.println("Give me a verb ending in ing");
		String noun1 = in.nextLine();
		System.out.println("Give me a plural noun");
		String noun2 = in.nextLine();
		
		
		
		
		
		
		System.out.println(name1+ " spends too much time "+noun1+" "+noun2); 
	}

}
