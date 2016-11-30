package com.demo.guava.g2_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimaps;

public class New1_MultiMap {
	
	//一种key可以重复的map，可以代替Map<K, Collection<V>>
	//ListMultimap 和 SetMultimap，对应的通过key分别得到list和set
	@Test
	public void test() {
		ArrayListMultimap<String, User> mMap = ArrayListMultimap.create();//可以代替Map<string, List<Object>>
		mMap.put("lakers", new User("kobe", 38));
		mMap.put("heat", new User("wade", 35));
		mMap.put("heat", new User("lbj", 30));

		List<User> list = mMap.get("heat");
		for(User user : list) {
			System.out.println(user);
		}
		
		HashMultimap<String, String> mSet = HashMultimap.create();//可以代替Map<string, Set<Object>>
		mSet.put("lakers", "kobe");
		mSet.put("lakers", "kobe");
		mSet.put("heat", "wade");
		mSet.put("heat", "lbj");
		
		Set<String> set = mSet.get("heat");
		for (String s : set) {
			System.out.println(s);
		}
	}
	
	//根据某个字段分组，然后取出某个组
	@Test
	public void groupTest() {
		ArrayList<User> list = Lists.newArrayList();
		list.add(new User("kobe", 38));
		list.add(new User("wade", 35));
		list.add(new User("lbj", 30));
		list.add(new User("kd", 30));
		list.add(new User("kr", 30));
		
		ListMultimap<Integer, User> index = Multimaps.index(list, new Function<User, Integer>(){
			@Override
			public Integer apply(User input) {
				return input.getAge();
			}});
		
		List<User> list2 = index.get(30);
		for (User user : list2) {
			System.out.println(user);
		}
	}

}
