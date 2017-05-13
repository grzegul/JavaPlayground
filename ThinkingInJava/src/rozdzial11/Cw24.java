package rozdzial11;
import java.util.*;

class Member{
	private String name = "";
	private int number = 0;
	
	public Member(String name, Integer number){
		this.name = name;
		this.number = number;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString(){
		return name + ": " + number + ", ";
	}
}

public class Cw24 {

	public static void main(String[] args) {
		Map<String, Integer> zbior = new LinkedHashMap<String, Integer>();
		zbior.put("Mama",1);
		zbior.put("Tata",2);
		zbior.put("Syn",3);
		zbior.put("Corka",4);
		System.out.println("zbior: " + zbior);
		
		TreeSet<String> sorted = new TreeSet<String>();
		sorted.addAll(zbior.keySet());
		System.out.println(sorted);
		
		List<Member> temp = new LinkedList<Member>();		
		for (String s : sorted){
			Member m = new Member(s, zbior.get(s));
			temp.add(m);
			
		}
		zbior.clear();
		for (Member m : temp){
			zbior.put(m.getName(), m.getNumber());
		}
		System.out.println(zbior);
	}
}
