
public class Sprawdzanie {

	public static void main(String[] args) {
		String str = "abc";
		str.concat("d");
		System.out.println(str);
		str = str.concat("d");
		System.out.println(str);

		
		StringBuffer sb = new StringBuffer("efg");
		sb.append("h");
		System.out.println(sb);
	}

}
