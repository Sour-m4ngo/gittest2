package Two_sum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Solution {
		    public int[] twoSum(int[] nums, int target) {
		        for (int i = 0; i < nums.length; i++) {
		            for (int j = i + 1; j < nums.length; j++) {
		                if (nums[j] == target - nums[i]) {
		                    return new int[] { i, j };
		                }
		            }
		        }
		        throw new IllegalArgumentException("No two sum solution");//test test111111
		    }
		}

	}

}
