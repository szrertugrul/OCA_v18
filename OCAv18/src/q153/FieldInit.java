package q153;

public class FieldInit {
			Character c;
			boolean b;
			float f;
			void printAll() {
				System.out.println("c= "+c);//c= null - wrapper Boolean class accepts null
				System.out.println("b= "+b);//b=false
				System.out.println("f= "+f);//f=0.0
			}		
			public static void main(String[] args) {
				FieldInit f=new FieldInit();
				f.printAll();
			}
		}