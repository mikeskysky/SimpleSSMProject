package com.soecode.lyf.service.impl;

import static org.junit.Assert.fail;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.service.BookService;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}
	
	@Test
	public void testThread() throws Exception
	{
		ExecutorService executorService = Executors.newFixedThreadPool(10);
	    for (int i = 0; i < 10; i++) {
	        executorService.execute(new Runnable() {
	            @Override
	            public void run() {
	                bookService.addBook();
	            }
	        });
	        Thread.sleep(100);
	    }
	}

}
