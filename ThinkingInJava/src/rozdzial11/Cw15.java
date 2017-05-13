package rozdzial11;
import net.mindview.util.Stack;

public class Cw15 {

	public static void main(String[] args) {
		/*Stack<String> s = new Stack<String>();
		s.push("B");
		s.push("a");
		s.push("l");
		System.out.print(s.pop());
		System.out.print(s.pop());
		System.out.print(s.pop());
		s.push("a");
		s.push("g");
		s.push("a");
		System.out.print(s.pop());
		System.out.print(s.pop());
		System.out.print(s.pop());
		s.push("n");
		System.out.print(s.pop());
		s.push("w");
		System.out.print(s.pop());
		s.push("l");
		s.push("i");
		s.push("t");
		System.out.print(s.pop());
		System.out.print(s.pop());
		System.out.print(s.pop());
		s.push("e");
		System.out.print(s.pop());
		s.push("r");
		s.push("k");
		System.out.print(s.pop());
		System.out.print(s.pop());
		s.push("a");
		s.push("c");
		s.push("h");
		System.out.print(s.pop());
		System.out.print(s.pop());
		System.out.print(s.pop());
		*/
		
		Stack<String> gg = new Stack<String>();
		String[] g = "+B+a+l---+a+g+a---+n-+w-+l+i+t---+e+r+k--+a+c+h---".split("");
		for (int i=0; i<g.length; i++){
			if (g[i].equals("+")){
				gg.push(g[i+1]);
			}else if(g[i].equals("-")){
				System.out.print(gg.pop());
			}
			else{}
		}
	}

}
