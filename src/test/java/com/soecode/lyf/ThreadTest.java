package com.soecode.lyf;

public class ThreadTest 
{
	public static void main(String[] args) {
		CountDownLatchTest test1=new CountDownLatchTest(1);
		CountDownLatchTest test2=new CountDownLatchTest(1);
		Thread t1=new Thread(new Runnable(){
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("子线程运行------------");
				test1.countDown();
			}
		});
		Thread t2=new Thread(new Runnable(){
			public void run() {
				test1.await();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("222子线程运行------------");
				test2.countDown();
			}
		});
		t1.start();
		t2.start();
		test2.await();
		System.out.println("主线程运行------");
	}
}
