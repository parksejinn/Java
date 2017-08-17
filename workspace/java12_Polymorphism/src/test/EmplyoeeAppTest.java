package test;

import util.MyDate;
import vo.child.Manager;
import vo.parent.Employee;

// 1. Employee class 
// 2. Manager class
// 3. Print employee info
// 4. Print manager info
public class EmplyoeeAppTest {
	public static void main(String[] args){
		Employee e1 = 
				new Manager("111-111", "James", new MyDate(1960,5,2), 45000.0, "IT");
		
		System.out.println(e1.getDetails());
		// ** Virtual Method Invocation ** //
		// --> On compile, method of parent class is called
		// --> On run-time, method of child class is called
		
		Manager m1 = (Manager)e1;
		m1.changeDept("Management");
		System.out.println(e1.getDetails());
		
	}	
}
