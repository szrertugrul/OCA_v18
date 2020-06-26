package q146;

public class Question146 {

	public static void main(String[] args) {
		// Given the code fragment
		String[] strs=new String[2];
		int idx=0;
	
		//we can not concat if array is null
		for (String s : strs) {
			strs[idx].concat("element "+idx);
			idx++;
		}
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);		
		}
	}
}

/*
 * What is the output?
 * A. Element 0Element 1
 * B. Null element 0Nullelement 1
 * C. NullNull
 * D. A null pointer exception is thrown at runtime.
 */
//Answer: D