package com.demo.guava.g2_collections;

import java.util.HashSet;

import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

public class ImmutableTest {
	
	//创建不可变的list，hashset，hashmap
	//of(), copyOf(), builder()
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		ImmutableList<String> iList = ImmutableList.of("a", "b", "a");
		try {
			iList.add("3");
		} catch(UnsupportedOperationException e) {
			System.out.println("不允许改变ImmutableList");
		}

		HashSet<String> set = Sets.newHashSet("a", "b");
		ImmutableSet<String> iSet=ImmutableSet.copyOf(set);
		try {
			iSet.add("c");
		} catch(UnsupportedOperationException e) {
			System.out.println("不允许改变ImmutableSet");
		}
		
		ImmutableMap<String, Boolean> iMap = ImmutableMap.<String, Boolean>builder()
				.put("off", false)
				.put("on", true)
				.build();
		try {
			iMap.put("hi", false);
		} catch(UnsupportedOperationException e) {
			System.out.println("不允许改变ImmutableMap");
		}
		
	}

}
