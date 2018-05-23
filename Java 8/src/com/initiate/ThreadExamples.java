package com.initiate;
public class ThreadExamples
{
	public static void main(String args[])
	{
		PersonNew person=new PersonNew();
		person.newAge=5;
		person.newName="Premal";
		
		Thread t1=new Thread(new Producer(person));
				t1.start();
		Thread t2=new Thread(new Consumer(person));
				t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("In Main"+person.newAge);
	}
	
}

