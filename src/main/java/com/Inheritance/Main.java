package com.Inheritance;

public class Main {
	
	
	  public static void main(String[] args) {

		  //Single inheritance
		    // create an object of the subclass
			  SubClass subclass = new SubClass();

		    // access field of superclass
			  subclass.name = "Rohu";
			  subclass.display();

		    // call method of superclass
		    // using object of subclass
			  subclass.display2(); 
			 

		  }
		}