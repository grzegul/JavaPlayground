package io.github.grzegul;

public class ARemover {

	public String remove(String str) {
		if(str.length()==0){
			return str;
		}
		if(str.charAt(1)=='A'){
			StringBuilder sb = new StringBuilder(str);
			sb.deleteCharAt(1);
			str = sb.toString();
		}
		if(str.charAt(0)=='A'){
			StringBuilder sb = new StringBuilder(str);
			sb.deleteCharAt(0);
			str = sb.toString();
		}
		
		return str;
	}
	
}
