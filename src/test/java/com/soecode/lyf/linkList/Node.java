package com.soecode.lyf.linkList;

public class Node 
{
	public long data;
	public Node next;
	
	
	public Node(long data) {
		super();
		this.data = data;
	}
	
	public void display()
	{
		System.out.println(data+" ");
	}
}
