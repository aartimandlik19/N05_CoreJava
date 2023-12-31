package com.tnsif.daytwentyone;
//Program to demonstrate functional interface using Lambda Expression
public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube c=(no)->no*no*no;
		System.out.println(c.getCube(4));
		
		Operations obj;
	
		//Addition of two integers
		obj=(a,b)->{ return a+b;};
		System.out.println(obj.performArithmetic(10, 20));
	
		//Subtraction of two integers
		obj=(a,b)->a-b;
		System.out.println(obj.performArithmetic(10, 20));
		
		//Multiplication of two integers
		obj=(a,b)->a*b;
		System.out.println(obj.performArithmetic(10, 20));
		
		//Division of two integers
		obj=(a,b)->a/b;
		System.out.println(obj.performArithmetic(10, 3));


	}

}
