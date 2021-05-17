package com.polymorphism;

public class Sum {

	//static polymorphism
	    // Overloaded sum().
	    // sum takes two int parameters
	    public int sum(int x, int y)
	    {
	        return (x + y);
	    }
	  
	    // Overloaded method.
	    // sum takes three int parameters
	    public int sum(int x, int y, int z)
	    {
	        return (x + y + z);
	    }
	  
	    // Overloaded method.
	    //sum takes two double parameters
	    public double sum(double x, double y)
	    {
	        return (x + y);
	    }
	  
	    public static void main(String args[])
	    {
	        Sum s = new Sum();
	        System.out.println(s.sum(10, 20));
	        System.out.println(s.sum(10, 20, 30));
	        System.out.println(s.sum(10.5, 20.5));
	        
	        
	        Add2 ad=new Add();
	        System.out.println(ad.add(10, 20));
	        System.out.println(ad.sum(10, 5,35));
	        System.out.println(ad.sum(30, 50, 100));
	        
	        Add2 ad2=new Add2();
	        System.out.println(ad.add(10, 20));
	        System.out.println(ad.sum(10, 5,35));
	        
	        
	    }
	}

