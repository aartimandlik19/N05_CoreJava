package com.tns.daythirteen;
public class ThreadDemo {
		static void printhello() {
			System.out.println("printhello:"+Thread.currentThread());
			for(int i=1;i<=3;i++)
			{
				System.out.println("hello");
			}
		}
		public static void printodd()
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
				System.out.println("printodd:"+Thread.currentThread());
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t);
		printhello();
		System.out.println(Thread.currentThread());
		printodd();

	}

}
