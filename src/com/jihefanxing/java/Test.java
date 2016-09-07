package com.jihefanxing.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("a");
		list.add("a");
		System.out.println(list);
		
		Set<String> set=new TreeSet<>();
		set.add("b");
		set.add("a");
		System.out.println(set);
		
		Map<String, String>map=new HashMap<>();
		map.put("张三", "23");
		map.put("张四", "12");
		System.out.println(map.get("张三"));
		
		Map<String, String>map1=new HashMap<>();
		map1.put(null, null);
		System.out.println(map1);
		
		List<String> list1=new ArrayList<>();
		list1.add("a");
		list1.add("aa");
		list1.set(0, "abc");//替换第0个元素
		List<String> list2=new ArrayList<>();
		list1.addAll(list2);
		System.out.println(list1);
	}

}
