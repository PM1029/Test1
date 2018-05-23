package com.initiate;

public class Producer implements Runnable {
	PersonNew person;
	
	Producer(PersonNew person)
	{
		this.person=person;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		change();
		
		
	}
	void change()
	{
		synchronized(person)
		{
		this.person.newAge=33;
		System.out.println(person.newAge);
		try {
			person.wait();
			System.out.println("After waiting");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	

}
