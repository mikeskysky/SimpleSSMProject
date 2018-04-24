package com.soecode.lyf.graph;

public class Graph 
{
	//顶点数组
	private Vertex[] vertexList;
	//邻结矩阵
	private int[][] adjMat;
	//顶点最大数目
	private int maxSize;
	//当前顶点
	private int nVertex;
	//栈
	private MyStack stack;
	
	public Graph()
	{
		vertexList=new Vertex[maxSize];
		adjMat=new int[maxSize][maxSize];
		for(int i=0;i<maxSize;i++)
		{
			for(int j=0;j<maxSize;j++)
			{
				adjMat[i][j]=0;
			}
		}
		nVertex=0;
		
	}
	
	/**
	 * 添加顶点
	 * @param label
	 */
	public void addVertex(char label)
	{
		vertexList[nVertex++]=new Vertex(label);
	}
	
	public void addEdge(int start,int end)
	{
		adjMat[start][end]=1;
		adjMat[end][start]=1;
	}
	
}
