package DynamicProgramming;
/*
 * 	Input: [2,7,9,3,1]
	Output: 12
	Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
 * */
public class HouseRobber {
	public int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int a = nums[0];
        int b = Math.max(nums[0],nums[1]);
        int max=-1;
        for(int i=2;i<nums.length;i++){
            max=Math.max(nums[i]+a,b);
            a=b;
            b=max;
        }
        return max;
    }
}
