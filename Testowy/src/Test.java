// import static net.mindview.util.Print.*;
public class Test {
	public static void main(String[]args){
		long a = 0x2f;
		
		System.out.format("a=%d%n", a);
		System.out.println("a=" + Long.toBinaryString(a));
		String s = "1:2:3:";
		System.out.println(s.endsWith(":")&&((s.split(":")).length>1));
	}
}
