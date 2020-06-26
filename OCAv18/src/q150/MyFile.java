package q150;

public class MyFile {

	public static void main(String[] args) {    
		// the argument of main method includes String array if the given command is int	
		String arg1 = args[0];  						
		String arg2 = args[1];							
		String arg3 = args[2];						
		System.out.println("Arg is " + arg3);	
	}
}

/* 
	Which command-line arguments should you pass to the program to obtain the following output?   Arg is 2
	
A.	java MyFile 2
B.	java MyFile 1 2 3 4
C.	java MyFile 1 2 2
D.	java MyFile 2 2


											Answer: C
											
	//to check it choose click drop-down menu of Run --> Run Configuration --> choose class MyFile --> Arguments --> type args --> Run
*/


//public static void main(String[] args) {    
//	// the argument of main method includes String array if the given command is int
//	
//	String arg1 = args[1];  						 // second index of array is arg1
//	String arg2 = args[2];							// third index of array is arg2
//	String arg3 = args[3];							// forth index of array is arg3
//	System.out.println("Arg is " + arg3);	// to print "Args is 2" , arg3 or forth index of the array must be equal to 2 ==> answer is A
//	
//	// to check it choose click drop-down menu of Run --> Run Configuration --> choose class MyFile --> Arguments --> type args --> Run
//
//}
//
//}
//
//
///* 
//Which command-line arguments should you pass to the program to obtain the following output?   Arg is 2
//
//A. java MyFile 1 3 2 2       // these are the arguments, each int is considered as String, each element is separated by space
//
//B. java MyFile 2 2 2
//
//C. java MyFile 1 2 2 3 4
//
//D. java MyFile 0 1 2 3
//
//										Answer: A
//
//*/


