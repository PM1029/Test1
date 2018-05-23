package com.initiate;

public class Consumer implements Runnable {
	
PersonNew person;
	
	Consumer(PersonNew person)
	{
		this.person=person;
		this.person.newAge=39;
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
		this.person.newAge=39;
		System.out.println(person.newAge);
		person.notifyAll();
		}
	}

}
