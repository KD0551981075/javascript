package coding;

public class Solution {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length-1;i++)
		{
			for (int j = i+1; i < j+1; j++) {
				if (nums[i] == nums[j])
					count++;
			}
		}
        return count;
    }
	
	  public static void main(String args[]) { int nums[] = {1,2,3,1,1,3};
	  
	  System.out.println(numIdenticalPairs(nums)); }
	 
    
    
}