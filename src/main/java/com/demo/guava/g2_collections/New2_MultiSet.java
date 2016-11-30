package com.demo.guava.g2_collections;

import java.util.Set;

import org.junit.Test;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset.Entry;

public class New2_MultiSet {
	
	//不是集合，可以增加重复的元素，并且可以统计出重复元素的个数
	@Test
	public void test() {
		Multiset<String> multiSet = HashMultiset.create();
		multiSet.add("a");
		multiSet.add("b");
		multiSet.add("c");
		multiSet.add("b");
		multiSet.add("b");

		System.out.println(multiSet.size());
		System.out.println(multiSet.count("b"));
		
		Set<String> set = multiSet.elementSet();
		System.out.println(set);
		
		Set<Entry<String>> entrySet = multiSet.entrySet();
		for (Entry<String> entry : entrySet) {
			System.out.println(entry.getElement() + ": " + entry.getCount());
		}
	}

}
