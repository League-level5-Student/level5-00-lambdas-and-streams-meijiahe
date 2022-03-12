package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String reverse = "";
			for(int i = s.length()-1; i >= 0; i--) {
				reverse = reverse + s.charAt(i);
			}
			System.out.println(reverse);
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String temp = "";
			for(int i = 0; i <s.length(); i++) {
				if (i%2==0) {
			temp = temp + s.substring(i,i+1).toUpperCase();
				}
				else {
			temp = temp + s.substring(i,i+1).toLowerCase();
			//substring gives us one letter stuck into a string object started from i to i+1. 
			// the end value is not included, only start is included
				}
			}
			System.out.println(temp);
		}, "hello");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String temp = "";
			for(int i = 0; i <s.length(); i++) {
				temp = temp + s.substring(i,i+1) + "." + s.substring(s.length());
			}
			System.out.println(temp);
		}, "happy");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String vowels = "aeiouAEIOU";
			for (int k=0;k<vowels.length();k++) {
			s = s.replace(vowels.charAt(k)+"", "");
					// now we can replace with string values
			// we don't need if statements nor for loop of the string length bc every vowel value just replace it
				}
			System.out.println(s);
		}, "watermelon");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
