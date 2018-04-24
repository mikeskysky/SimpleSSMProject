package com.soecode.lyf.contron;

public class ContructTest 
{
	public static void main(String[] args) {
		B b=new B("123");
	}
}
class A
{
	public A()
	{
		System.out.println("A()");
	}
	public A(String str)
	{
		System.out.println("A(String str)");
	}
	public A(String str1,String str2)
	{
		System.out.println("A(String str1,String str2)");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("B()");
	}
	public B(String str)
	{
		System.out.println("B(String str)");
	}
	public B(String str1,String str2)
	{
		System.out.println("B(String str1,String str2)");
	}
}
