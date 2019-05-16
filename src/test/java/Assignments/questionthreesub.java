package Assignments;

import java.io.File;
import java.io.FileInputStream;
//import java.io.IOException;
import java.util.Properties;

//import java.util.Properties;

public class questionthreesub extends questionthreesuper {
	//static Properties prop = new Properties();
	
  //Method to perform multiplication in subclass	
  public void multiplication(int x, int y) {
  z = x * y;
  System.out.println("The product of the given numbers:"+z);
		   
  }
			
  public static void main(String args[]) throws Throwable {
	  
  //Reading from Config file
	     File file = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" +  File.separator + "config.properties");
	     Properties prop = new Properties();
	     FileInputStream fip = new FileInputStream(file);
	     prop.load(fip);
	     
 //assigning keys and values from config file and casting it to integer type
	     String value = prop.getProperty("a");
	     int a1 = Integer.parseInt(value);
	     String value2 = prop.getProperty("b");
	     int b1 = Integer.parseInt(value2);
	     
	     
	 
 //creating object of the subclass
  questionthreesub obj= new questionthreesub();
  //passing the parameters by creating an object 
  obj.add(a1, b1);
  obj.Sub(a1, b1);
  obj.multiplication(a1, b1);
		  
  }
  
  
  
}
	

