import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.*;


public class Tescik {
	private static Pattern p = Pattern.compile("\\w+\\.| final| native");
	public static void main(String[] args) {
		try{
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if(args.length == 1) {
				for(Method method : methods)
					System.out.println(p.matcher(method.toString()).replaceAll(""));
			}
		} catch(ClassNotFoundException e) {
			System.out.println("No such class: " + e);
		}
	}
}

/*public static void Tescik.main(java.lang.String[])
public final void java.lang.Object.wait() throws java.lang.InterruptedException
public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
public boolean java.lang.Object.equals(java.lang.Object)
public java.lang.String java.lang.Object.toString()
public native int java.lang.Object.hashCode()
public final native java.lang.Class java.lang.Object.getClass()
public final native void java.lang.Object.notify()
public final native void java.lang.Object.notifyAll()*/