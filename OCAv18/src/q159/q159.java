package q159;

public class q159 {
	class Book{int pages;}
	public class App{
		 int count ;
		public void method (Book x,int k) {
			x.pages=100;
			k=200;
		}
		
		public static void main(Strig[]args) {
			App obj =new App();
			Book objBook= new Book();
			System.out.println(objBook.pages+":"+obj.count);obj.method(objBook, count);
			obj.method(objBook, obj.count);
			System.out.println(objBook.pages +":"+obj.count);
			
			
		}
	}		
		
	


