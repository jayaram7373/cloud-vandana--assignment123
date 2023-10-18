package example;

import java.util.Scanner;

public class pangram {
	
	

	    public static void main(String[] args) {
	    	Scanner scanner=new Scanner(System.in);
	    	System.out.println("enter the pangram");
	    	String input=scanner.nextLine();
	    	scanner.close();
	       
	        boolean isPangram = checkIfPangram(input);
	        
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean checkIfPangram(String str) {
	        str = str.toLowerCase(); // Convert to lowercase for case insensitivity
	        boolean[] alphabet = new boolean[26];

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (Character.isLetter(c)) {
	                alphabet[c - 'a'] = true;
	            }
	        }

	        for (boolean isPresent : alphabet) {
	            if (!isPresent) {
	                return false;
	            }
	        }

	        return true;
	    }
	}



