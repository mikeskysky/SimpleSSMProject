package com.soecode.lyf.tower;

/**
 * 汉诺塔
 * @author Administrator
 *
 */
public class HanoiTower 
{
	public static void main(String[] args) {
		doTower(4, 'A','B','c');
	}
	
	/**
	 * 
	 * @param topN 表示几层
	 * @param from 从哪里开始移动
	 * @param enter 中间过度
	 * @param to 目的地
	 */
	public static void doTower(int topN,char from,char enter,char to)
	{
		if(topN==1)
		{
			System.out.println("盘子1,从"+from+" 移动到"+to);
		}
		else
		{
			doTower(topN-1, from, to,enter);
			System.out.println("盘子"+topN+"从 "+from+"移动到"+to);
			doTower(topN-1,enter,from,to);
		}
	}
}
