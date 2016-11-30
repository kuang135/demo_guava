package com.demo.guava.g4_predicate;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class PredicateTest {

	//谓词（Predicate）是用来筛选集合的；
	@Test
	public void test() {
		ArrayList<Player> players = Lists.newArrayList(
				new Player("kobe", 38),
				new Player("wade", 35),
				new Player("james", 30)
			);
		//Predicates含有一些内置的筛选方法，比如说 in ,and ,not等，根据实际情况选择使用。
		Collection<Player> young = Collections2.filter(players, new Predicate<Player>(){
			@Override
			public boolean apply(Player p) {
				return p.getAge() > 30 ? true : false;
			}});
		System.out.println(young);
	}
}
