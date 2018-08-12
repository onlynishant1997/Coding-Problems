package Arrays;

import java.util.HashMap;

/*
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


public class TwoSum {
	
	public static int[] twoSum(int a[],int n,int target) {
		if(a==null||a.length<2)return new int[] {0,0};
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(a[i])) {
				return new int[] {map.get(a[i]),i};
			}
			else map.put(target-a[i], i);
		}
		return new int[] {0,0};
	}
	
	
	public static void main(String[] args) {
		int a[]= {2, 7, 11, 15};
		int target=9;
		int arr[]=twoSum(a, a.length, target);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
