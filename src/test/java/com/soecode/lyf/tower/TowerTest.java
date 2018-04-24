package com.soecode.lyf.tower;

public class TowerTest
{
	public static void main(String[] args) {
		doTower(3,'A','B','C');
	}
	public static void doTower(int topN,char from,char middle,char to)
	{
		if(topN==1)
		{
			System.out.println("盘子1,从"+from+"移动到"+to);
		}
		else
		{
			doTower(topN-1, from, to, middle);
			System.out.println("盘子"+topN+"从"+from+"移动到"+to);
			doTower(topN-1,middle,from,to);
		}
	}
}
