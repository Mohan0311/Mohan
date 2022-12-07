package org.emp;



public class Employee1 {
	
	private int test(int empId) {
		int res = 0 ;
if (empId == 10) {
	
	res = 100;
	System.out.println("1");
}	
if (empId == 20) {
	System.out.println("2");
	res = 200;
	
}
if (empId == 30) {
	res = 400; 
	System.out.println("3");
	
	System.out.println("hhjh");
}
System.out.println("4");
return res ;

}	

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		int test = e.test(30);
		System.out.println(test);
		
	}
	
	}
	
	
	
	


