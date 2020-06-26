package q147;

class Employee {
	private String name;
	private int age;
	private int salary;
	
	Employee(String name, int age) {
		setName(name);
		setAge(age);
		setSalary(2000);
}
	Employee(String name, int age, int salary) {
		this(name, age);
		setSalary(salary);
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void  printDetails() {
		System.out.println(name + " : " + age + " : " + salary);
}
	class Test{}
	public static void main(String[] args) {
		Employee e1 = new Employee(); // there is no non-parameterized constructor
		Employee e2 = new Employee("Jack", 50);
		Employee e3 = new Employee("Chloe", 40, 5000);
		
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}
}
/* 
  Which two modifications, when made independently, enable the code to print joe:true:100.0 ?
 
 * bu haliyle calsitirdigimizda outp: null:false:0.0 

   
  		A: Replace line2 with:
		 	e.name = "Joe";
		 	e.contract = true;
			e.salary = 100;
			
		B: Replace line2 with:
		 	this.name = "Joe";
		 	this.contract = true;
			this.salary = 100;
		 
		 C: Replace line n1 with:
			this.name = new String("Joe");
			this.contract = new Boolean(true);
			this.salary = new Double(100);
			
		D: Replace line2 with:
		 	name = "Joe";
		 	contract = TRUE;
			salary = 100.0f;
			
		E: Replace line n1 with:
			this("Joe", true, 100);
		

	
* 'toString()' method : Object class'inda zaten oldugu icin bu methodu yazdigimizda override goruruz ve
  her object olusturdugumuzda bu method calisir. Aslinda override etmeyince zaten memory'deki yerini gosterir.  	
		*/