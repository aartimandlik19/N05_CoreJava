package com.tns.daythirteen;

	public class ChildThread extends Thread{
		public void run() {
			System.out.println("this is the task of child thread...."+Thread.currentThread());
			//System.out.println(Thread.currentThread);
			ThreadDemo.printhello();
			
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
