/**
	* File: Lesson 4.4 - Boolean functions with loops
	* Author: Mr. Kalisz
	* Date Created: April 6, 2023
	* Date Last Modified: April 6, 2023
	*/

class Notes {
	public static void main(String args[]) {

		//choosing between for and while loops

		//for loop is when we know how many times we want to loop BEFORE we start looping

		//while loop runs when we have no idea how many times it will run BEFORE we start looping

		//assumptions in programs
		//give us a word and check if it has an 'a' in it

		boolean flag = false; //assume the string does not have an 'a' until we find one

		String word = "";

		for(int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a') {
				flag = true;
			}
		}

		System.out.println(flag);
	}
}