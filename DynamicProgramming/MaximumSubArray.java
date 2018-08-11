package DynamicProgramming;
/*
 * 	Input: [-2,1,-3,4,-1,2,1,-5,4],
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.
*/
public class MaximumSubArray {
	 public int maxSubArray(int[] nums) {
	        int max=nums[0];
	        int sum=nums[0];
	        for(int i=1;i<nums.length;i++){
	            sum=Math.max(nums[i]+sum,nums[i]);
	            max=Math.max(sum,max);
	        }
	        return sum;
	    }
}
