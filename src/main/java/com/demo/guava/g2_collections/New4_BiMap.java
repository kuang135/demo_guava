package com.demo.guava.g2_collections;

import org.junit.Test;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class New4_BiMap {
	
	//是一个一一映射，可以通过key得到value，也可以通过value得到key
	@Test
    public void BimapTest(){
        BiMap<Integer,String> logfileMap = HashBiMap.create(); 
        logfileMap.put(1,"a.log");
        logfileMap.put(2,"b.log");
        logfileMap.put(3,"c.log"); 
        System.out.println("logfileMap:"+logfileMap); 
        BiMap<String,Integer> filelogMap = logfileMap.inverse();//反转的map不是新的map对象，它实现了一种视图关联
        System.out.println("filelogMap:"+filelogMap);
        
        logfileMap.put(4,"d.log"); 

        System.out.println("logfileMap:"+logfileMap); 
        System.out.println("filelogMap:"+filelogMap); 
    }

}
