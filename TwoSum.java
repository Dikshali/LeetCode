package github;

import java.util.HashMap;

public class TwoSum {

	public static void main(String args[]) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int []  output = new int[2];
		output = twoSum(nums, 10);
		System.out.println(output[0]+", "+output[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        //O(n)
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(hs.containsKey(complement)){
                return new int[] {hs.get(complement), i};
            }
            hs.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found"); 
    }
    //O(n^2)
    /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int complement = target - nums[i];
                if(complement == nums[j]){
                    return new int[] {i,j};
                }
            }
        }*/
}
