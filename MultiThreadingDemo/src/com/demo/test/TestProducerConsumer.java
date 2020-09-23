package com.demo.test;

import com.demo.bean.Storage;
import com.demo.thread.Consumer;
import com.demo.thread.Producer;

public class TestProducerConsumer {
	public static void main(String[] args) {
		Storage s=new Storage();
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
		p.start();
		c.start();
		
	}
}
