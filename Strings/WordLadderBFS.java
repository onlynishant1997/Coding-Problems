package Strings;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadderBFS {
	public static void main(String[] args) {
		String start="hit";
		String end="cog";
		HashSet<String> hs= new HashSet<>();
		hs.add("hot");
		hs.add("dot");
		hs.add("dog");
		hs.add("lot");
		hs.add("log");
		hs.add("cog");
		System.out.println(ladderLength(start,end,hs));
	}

	private static int ladderLength(String start, String end, HashSet<String> hs) {
		Set<String> unvisited=new HashSet<>(hs);
		Queue<String> queue=new LinkedList<>();
		int distance = 2;
		unvisited.remove(start);
		if(!unvisited.contains(end))return 0;
		queue.offer(start);
		while(queue.size()!=0) {
			String top=queue.poll();
			//System.out.println("-/-/-/"+top);
			char topArray[]=top.toCharArray();
			for(int i=0;i<topArray.length;i++) {
			//	System.out.println("--------");
				char temp=topArray[i];
				for(int j=0;j<26;j++) {
					topArray[i]=(char)('a'+j);
					String newWord = new String(topArray);
				//	System.out.println(newWord);
					if(unvisited.contains(newWord)) {
						System.out.println("//"+newWord+"//");
						if(newWord.equals(end)) {
							return distance;
						}
						else {
							queue.offer(newWord);
							unvisited.remove(newWord);
						}
					}
				}
				topArray[i]=temp;
			}
			distance++;
		}
		return 0;
	}
}
