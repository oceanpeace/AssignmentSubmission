package Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

//annotation for listeners
@Listeners(Assignments.Listener.class)

public class ListenerTestCase {

	
//test for passing with priority 2
	@Test(priority=2)
	public void PassingTest(){
		lTraining Candidate = new lTraining();
		Candidate.setName("Arun");
		System.out.println(Candidate.getName());
		
		
	}
	
//test for failing with priority 1	
	@Test(priority=1)
	public void FailingTest(){
		lTraining Candidate = new lTraining();
		//Candidate.setName("Arun");
		System.out.println(Candidate.getName());
		
		
	}
	

}
