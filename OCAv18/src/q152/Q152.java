package q152;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q152 {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("A", "B", "C", "D");
		Iterator<String> itr = lst.iterator();	
		while (itr.hasNext()) {
			String e = itr.next();
			if (e == "C") {
				break;
			}
			else {
				//continue;  // statements can’t be reached after continue/break
				System.out.println(e);
			}
		}
	}
}
