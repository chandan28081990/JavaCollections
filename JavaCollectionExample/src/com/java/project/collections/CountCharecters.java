package com.java.project.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="I love India";
		input=input.replaceAll("\\s","").toLowerCase();
		System.out.println(input);
		Map<Character,Integer> charCount= new LinkedHashMap<>(); //HashMap doesnt maintain order.
		for(int i=0;i<input.length();i++) {
			if(!charCount.containsKey(input.charAt(i))) {
				charCount.put(input.charAt(i),1);
			}else {
				charCount.put(input.charAt(i),charCount.get(input.charAt(i))+1);
			}
		}
		for(Map.Entry<Character,Integer> cc : charCount.entrySet()) {
			System.out.println(cc.getKey()+" :"+cc.getValue());
		}
	}

}
