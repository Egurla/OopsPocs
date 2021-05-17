package com.polymorphism;


public class Add  extends Add2{
	
	//Runtime polymorphism
	//method overriding with 2 parmameters 
	public int add(int x, int y)
    {
        return (x + y);
    }
	//method overriding with 3 parmameters
	public String sum(int x, int y, int z)
    {
        return (x + y + z+"in Add");
    }
	
	
	public String sum2(double x, double y, double z)
    {
        return (x + y + z+"in Add");
    }
}
