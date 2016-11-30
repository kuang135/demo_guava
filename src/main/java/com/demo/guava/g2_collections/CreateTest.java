package com.demo.guava.g2_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class CreateTest {
	
	//简化创建
	@SuppressWarnings("unused")
	@Test
	public void test() {
		ArrayList<String> list1 = Lists.newArrayList();
		ArrayList<String> list2 = Lists.newArrayList("a", "b", "c");
		LinkedList<String> list3 = Lists.newLinkedList();
		
		HashSet<String> set1 = Sets.newHashSet();
		HashSet<String> set2 = Sets.newHashSet("a", "b");
		
		HashMap<String,String> map1 = Maps.newHashMap();
		ImmutableMap<String, Boolean> map2 = ImmutableMap.of("ON", true, "OFF", false);
		System.out.println(map2);
		
	}
	
}
