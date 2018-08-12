package Arrays;
import java.util.ArrayList;

//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].


public class IntersectionOfArray {
	 public int[] intersect(int[] nums1, int[] nums2) {
	        ArrayList<Integer> al1=new ArrayList<Integer>();
	        ArrayList<Integer> al2=new ArrayList<Integer>();
	        for(int i:nums1){
	            al1.add(i);
	        }
	        for(int i:nums2){
	            if(al1.contains(i)){
	                al2.add(i);
	                int j=al1.indexOf(i);
	                al1.remove(j);
	            }
	        }
	        int arr[]=new int[al2.size()];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=al2.get(i);
	        }
	        return arr;
	    }
}
