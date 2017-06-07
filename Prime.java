// import java.util.*;

public class Prime {
	public static void main(String []args){
		String input = System.console().readLine();
		// int intized = Integer.parseInt(input);
		System.out.println(input.length());
		char a_char = input.charAt(2);
		System.out.println(a_char); 
		String[] split = input.split(" ");
		System.out.println(split.length); 
		for (int i = 0; i < split.length; i++){
			System.out.println(split[i]); 
		}
	}
}