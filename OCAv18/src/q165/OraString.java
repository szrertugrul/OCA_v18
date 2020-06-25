package q165;

public class OraString {
	String s;
	public boolean equals (OraString str) {
		return this.s.equalsIgnoreCase(str.toString());
	}
	OraString(String s){
		this.s=s;
	}
	public static void main(String[] args) {
String s1="Moon";
OraString s2=new OraString("Moon");

System.out.println(s2); // q165.OraString@7852e922
System.out.println(s2.s); // Moon

if ((s1=="Moon")&&(s2.equals("Moon"))) { // true && false ==> false
	System.out.println("A");
}else {System.out.println("B"); // printed
}
if (s1.equalsIgnoreCase(s2.s)) { // true
	System.out.println("C"); // printed
}else {
	System.out.println("D");
}
}
}

