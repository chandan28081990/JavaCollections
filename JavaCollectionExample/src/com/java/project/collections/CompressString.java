package com.java.project.collections;
import java.util.*;

public class CompressString {
    public static void main(String[] args) {
        String input = "aabbccddeeffab";
        //String output = compressString(input);
        String output=charCount(input);
        System.out.println("Output: " + output);
    }

    public static String compressString(String input) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count characters
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Build the output
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
        	//int count=0;
        	//while(entry.getValue()!=count) {
        		//result.append(entry.getKey());
        		//count++;
        	//}
        	if(entry.getValue()==2) {
        		result.append(entry.getKey());
        		result.append(entry.getKey());
        		result.append(entry.getValue());
        	}else {
            result.append(entry.getKey());
            result.append(entry.getValue());
        	}
        }

        return result.toString();
    }
    public static String charCount(String input) {
    	Map<Character,Integer> cc=new LinkedHashMap<>();
    	String result="";
    	for(int i=0;i<input.length();i++) {
    		if(!cc.containsKey(input.charAt(i))) {
    			cc.put(input.charAt(i),1);
    		}else {
    			cc.put(input.charAt(i),cc.get(input.charAt(i))+1);
    		}
    	}
    	for(Map.Entry<Character,Integer> entry: cc.entrySet()) {
    		if(entry.getValue()==2) {
    			result+=entry.getKey()+""+entry.getKey()+""+entry.getValue();
    		}else {
    			result+=entry.getKey()+""+entry.getValue();
    		}
    	}
    	return result;
    }
}
