package com.demo.guava.g4_predicate;

import java.util.List;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class TransformTest {

	@Test
	public void test() {
		List<Player> players = Lists.newArrayList(
				new Player("kobe", 38),
				new Player("wade", 35),
				new Player("james", 30)
			);
		List<String> names = Lists.transform(players, new Function<Player, String>(){
				@Override
				public String apply(Player input) {
					return input.getName();
				}
			});
		
		for (String name : names) {
			System.out.println(name);
		}
	}
	
}
