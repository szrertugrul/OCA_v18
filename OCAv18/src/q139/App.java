package q139;

public class App {
	int count;  // should be static 
	public static void displayMsg() {
		System.out.println("Welcome Visit Count: " + count++);	// line n1
	}		//Cannot make a static reference to the non-static field count
		public static void main(String[] args) {
			App.displayMsg();
			displayMsg();																		// line n2
}
}
