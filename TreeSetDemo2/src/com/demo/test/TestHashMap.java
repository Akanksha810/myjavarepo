package com.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Person;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		hm.put("b1", 20);
		hm.put("b2", 20);
		hm.put("b1", 23);
		hm.put("b3", 30);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter batch name");
		String id =sc.next();
		hm.get(id);
		Set<String> batches=hm.keySet();
		for(String b:batches) {
			if(hm.get(b)==20) {
				System.out.println(b);
			}
		}
		
		Set<Map.Entry<String, Integer>> es=hm.entrySet();
		for(Map.Entry<String, Integer> me:es) {
			if(me.getValue()==20) {
			  System.out.println(me.getKey()+"----->"+me.getValue());
			}
		}
		
		
		
		
	}

}
