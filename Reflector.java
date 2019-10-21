import java.util.*;
import java.lang.reflect.*;


public class Reflector {
	public static void main(String[] args) throws Exception {
		Set<String> s = new HashSet<>();
		s.add("foo");
		Iterator<String> it = s.iterator();
		Method m = it.getClass().getMethod("hasNext");
		System.out.println(m.invoke(it));
	}
}