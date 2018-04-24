package com.soecode.lyf.linkList;

public class LinkList 
{
	public Node first;

	public void insertFirst(long value)
	{
		Node insertNode=new Node(value);
		insertNode.next=first;
		first=insertNode;
	}
	
	public Node deleteFirst()
	{
		Node temp=first;
		first=temp.next;
		return temp;
	}
	
	public void display()
	{
		Node current=first;
		while(current!=null)
		{
			current.display();
			current=current.next;
		}
	}
	
	public static void main(String[] args) {
		LinkList linkList=new LinkList();
		linkList.insertFirst(12);
		linkList.insertFirst(13);
		linkList.insertFirst(14);
		linkList.display();
		linkList.deleteFirst();
		linkList.display();
	}
	
	
}
