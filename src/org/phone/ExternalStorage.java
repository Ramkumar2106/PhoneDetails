package org.phone;

public class ExternalStorage {
	public void size() {
		System.out.println("Size is 64GB");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExternalStorage e=new ExternalStorage();
		e.size();
		
		InternalStorage i=new InternalStorage();
		i.processorName();
		i.ramSize();
		
	}

}
