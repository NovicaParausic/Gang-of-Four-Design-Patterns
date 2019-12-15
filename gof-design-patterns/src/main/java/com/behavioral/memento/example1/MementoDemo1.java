package com.behavioral.memento.example1;

public class MementoDemo1 {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Employee emp = new Employee();
		
		emp.setName("John Wick");
		emp.setAddress("111 Main Street");
		emp.setPhone("555 333");
		System.out.println("Employee before save: " + emp);
		
		caretaker.save(emp);
		
		emp.setPhone("333 555");
		caretaker.save(emp);
		System.out.println("Employee after changed phone save: " + emp);
		
		emp.setPhone("353 535");
		caretaker.revert(emp);
		System.out.println("Reverts to last save point: " + emp);
		
		caretaker.revert(emp);
		System.out.println("Reverts to original: " + emp);
	}

}
