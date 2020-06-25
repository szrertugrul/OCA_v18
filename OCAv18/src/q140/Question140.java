package q140;
public class Question140 {
	    public static void main(String[] args) {
	        int iVar = 100;
	        float fVar = 100.100f;
	        double dVar = 123;
	          fVar = iVar;
	          iVar = fVar;	// float>int, float can't fit in int
	          fVar = dVar;// double can't fit in float
	          dVar = fVar;
	          iVar = dVar; // double can't fit in int
	          dVar = iVar;
	    }
	}


  /* which three lines fail to compile? (choose three.)
	        A. Line 7
	        B. Line 8
	        C. Line 9
	        D. Line 10
	        E. Line 11
	        F. Line 12

	        Answer: B C E
	        
	        
	        Second Version
	        the question was same but number of lines was changed.
	        ivar=fvar was at line 8.
	        fvar=dvar at line 9.
	        ivar= dvar at line 11.
	        be careful at line numbers.
	         */

