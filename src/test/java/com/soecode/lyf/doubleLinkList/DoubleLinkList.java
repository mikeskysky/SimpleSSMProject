package com.soecode.lyf.doubleLinkList;
/**
 * 双向链表(一个节点有上个节点的引用，还有下个节点的引用)
 * @author Administrator
 *
 */
public class DoubleLinkList 
{
	public Node first;
	public Node last;
	
	/**
	 * 从头结点开始插入
	 * @param value
	 */
	public void insertFirst(long value)
	{
		Node iNode=new Node(value);
		if(isEmpty())
		{
			last=iNode;
		}
		else
		{
			first.previous=iNode;
		}
		iNode.next=first;
		first=iNode;
	}
	
	public void insertLast(long value)
	{
		Node iNode=new Node(value);
		if(isEmpty()) first=iNode;
		else {
			last.next=iNode;
			iNode.previous=last;
		}
		last=iNode;
	}
	
	
	public boolean isEmpty()
	{
		return first==null;
	}
	
}
