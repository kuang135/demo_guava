package com.demo.guava.g3_ordering;

import java.util.List;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class OrderingTest {

	//natural,reverse,min,max,nullsFirst,nullsLast
	@Test
	public void test1() {
		List<Integer> numbers = Lists.newArrayList(30, 20, 60, 80, 10);
		//自然排序
		List<Integer> o1 = Ordering.natural().sortedCopy(numbers); //10,20,30,60,80
		System.out.println(o1);
		//反序
		List<Integer> o2 = Ordering.natural().reverse().sortedCopy(numbers); //80,60,30,20,10
		System.out.println(o2);
		//自然排序后，取最小值
		Integer min = Ordering.natural().min(numbers); //10
		System.out.println(min);
		//自然排序后，取最大值
		Integer max = Ordering.natural().max(numbers); //80
		System.out.println(max);

		List<Integer> numbers2 = Lists.newArrayList(30, 20, 60, 80, null, 10);
		//自然排序，null排最后
		List<Integer> o3 = Ordering.natural().nullsLast().sortedCopy(numbers2); //10, 20,30,60,80,null
		System.out.println(o3);
		//自然排序，null排最前
		List<Integer> o4 = Ordering.natural().nullsFirst().sortedCopy(numbers2); //null,10,20,30,60,80
		System.out.println(o4);
	}
	
	//对象排序
	@Test
	public void test2() {
		List<Person> list = Lists.newArrayList(
				new Person("kobe", 38),
				new Person("dumcan", 40),
				new Person("westbrook", 27),
				new Person("wade", 35),
				new Person("james", 30)
				);
		Ordering<Person> ordering = new Ordering<Person>() {
			//按年龄的大小排序
			@Override
			public int compare(Person left, Person right) {
				return left.getAge() - right.getAge();
			}
		};
		List<Person> sortedList = ordering.sortedCopy(list);
		System.out.println(sortedList);
	}
	
	//对象排序
		@Test
		public void test3() {
			List<Person> list = Lists.newArrayList(
					new Person("kobe", 38),
					new Person("dumcan", 40),
					new Person("westbrook", 27),
					new Person("wade", null),
					new Person("james", 30)
					);
			List<Person> sortedList = Ordering.natural().nullsFirst().onResultOf(new Function<Person, Integer>(){
				@Override
				public Integer apply(Person input) {
					return input.getAge();
				}
			}).sortedCopy(list);
			System.out.println(sortedList);
		}
	
}
