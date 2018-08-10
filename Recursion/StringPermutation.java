package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StringPermutation {
	public static void main(String[] args) {
		String str="nnnn";
		TreeMap<Character,Integer> hm=new TreeMap<>();
		for(int i=0;i<str.length();i++) {
			Character c=str.charAt(i);
			if(hm.containsKey(c)) {
				int v=hm.get(c);
				v++;
				hm.put(c, v);
			}else {
				hm.put(c, 1);
			}
		}
		/*for(Entry<Character, Integer> m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
		char words[]=new char[hm.size()];
		int count[]=new int[hm.size()];
		int i=0;
		for(Entry<Character, Integer> m:hm.entrySet()) {
			//System.out.println(m.getKey()+" "+m.getValue());
			words[i]=m.getKey();
			count[i]=m.getValue();
			i++;
		}
		char result[]=new char[str.length()];
		List<String> list=new ArrayList<String>();
		permutateUtil(words,count,result,0,list);
		//printList(list);	
		System.out.println("Rank of "+str+" is "+checkRank(list,str));
		//System.out.println(list.size());
	}

	private static int checkRank(List<String> l, String str) {
		// TODO Auto-generated method stub
		int rank=1;
		for(int i=0;i<l.size();i++) {
			if(l.get(i).equals(str)) {
				break;
			}
			rank++;
		}
		return rank;
	}

	private static void printList(List l) {
		/*for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}*/
		ListIterator<String> li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}

	private static void permutateUtil(char[] words, int[] count, char[] result, int level, List<String> list) {
		if(result.length==level) {
			list.add(new String(result));
			return;
		}
		for(int i=0;i<words.length;i++) {
			if(count[i]==0) {
				continue;
			}
			result[level]=words[i];
			count[i]--;
			permutateUtil(words, count, result, level+1, list);
			count[i]++;
		}
	}
}
