package q175;

public class App {

	int foo;
	static int bar;
	
	static void process() {
		foo += 10;  //Compile error verir int foo; oldugu         icin, static int foo; --> Cevap: 10, 20
		bar += 10;
	}
	public static void main(String[] args) {
		App firstObj = new App();
		App.process();
		System.out.println(firstObj.bar);
		
		App secondObj = new App();
		App.process();
		System.out.println(secondObj.bar);
	}

}
