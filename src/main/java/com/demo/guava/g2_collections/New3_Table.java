package com.demo.guava.g2_collections;

import org.junit.Test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class New3_Table {
	
	//Table: 相当于有两个key的map, 可以模拟表格，代替Map<FirstName, Map<LastName, Person>>
	@Test
	public void test() {
		Table<String, Integer, String> aTable = HashBasedTable.create();  
		 
        for (char a = 'A'; a <= 'C'; ++a) {  
            for (Integer b = 1; b <= 3; ++b) {   
                aTable.put(Character.toString(a), b, String.format("%c%d", a, b));  
            }  
        }  
        
        System.out.println(aTable.toString());
        System.out.println(aTable.column(2));  
        System.out.println(aTable.row("B"));   
        System.out.println(aTable.get("B", 2));  

        System.out.println(aTable.contains("D", 1));   
        System.out.println(aTable.containsColumn(3));   
        System.out.println(aTable.containsRow("C"));  
        System.out.println(aTable.columnMap()); 
        System.out.println(aTable.rowMap());   

        System.out.println(aTable.remove("B", 3)); 
        System.out.println(aTable.toString());
	}

}
