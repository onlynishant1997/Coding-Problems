package Strings;

/*
 * Input: ["flower","flow","flight"]
   Output: "fl"
 * Input: ["dog","racecar","car"]
   Output: ""
   Explanation: There is no common prefix among the input strings.
*/

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {      
		if(strs==null || strs.length==0){
	        return "";
	    }
	 
	    if(strs.length==1) 
	        return strs[0];
	    
	    int minLength=strs.length+1;
	    for(String s:strs) {
	    	if(minLength>s.length())minLength=s.length();
	    }
	    for(int i=0;i<minLength;i++) {
	    	for(int j=0;j<strs.length-1;j++) {
	    		String s1=strs[j];
	    		String s2=strs[j+1];
	    		if(s1.charAt(i)!=s2.charAt(i)) {
	    			return s1.substring(0, i);
	    		}
	    	}
	    }
	    return strs[0].substring(0, minLength);
	}
}
