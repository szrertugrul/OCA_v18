package q176;

abstract class Robot implements Speakable {
	public void process(); //Bu method abstract olmali cunki abstract class must have abstract method
}                           //public abstract void process();--> Helping... Done print eder(answer

class Humanoid extends Robot {
	public void speak (String s) {
		System.out.println(s);
	}
	public void process () {
		System.out.println("Helping... ");
	}
}
interface Speakable {
	public void speak(String s);
}


public class RobotApp {

	public static void main(String[] args) {
	
		Robot r = new Humanoid();
		r.process();
		r.speak("Done");
	
	}

}
