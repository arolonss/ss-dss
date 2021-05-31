/**
 * 
 */
package com.dss.jb.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author arolonss
 *
 */
public class Lambdas {
    
	
	
	public static void main(String[] args) {
		String[] strArr = {"nano", "racecar", "devil", "night", "bone", "food"};
		
		
		List<String> shortToLong = Arrays.stream(strArr).sorted((s1, s2) -> {
			return s1.length() - s2.length();
		}).collect(Collectors.toList());
		System.out.println(shortToLong);
		
		List<String> longToShort = Arrays.stream(strArr).sorted((s1, s2) -> {
			return s2.length() - s1.length();
		}).collect(Collectors.toList());
		System.out.println(longToShort);
	}
}
