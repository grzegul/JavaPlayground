package io.github.grzegul;

public class StringHelper {

	public String swapLast2Chars(String str) {
		if(str.length()<2){
			return str;
		}
		char firstChar = str.charAt(str.length() - 2);
		char secondChar = str.charAt(str.length() - 1);
		return "" + str.substring(0, str.length() - 2) + secondChar + firstChar;
	}

}
