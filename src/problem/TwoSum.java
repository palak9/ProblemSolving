package problem;

public class TwoSum {

	static class Solution {
		public static int[] twoSum(int[] nums, int target) {
			int location1 = 0;
			int location2 = 0;
			int result = 0;
			int resultNumsIndices[] = new int[2];
			boolean flag = false;
			for (int i = 0; i < nums.length - 1; i++) {
				for (int j = 0; j < nums.length; j++) {
					if (i != j) {
						System.out.println("nums[" + j + "]" + nums[j]);
						if (nums[i] < target) {
							result = nums[i] + nums[j];
							if (result == target) {
								location1 = i;
								location2 = j;
								flag = true;
							}
						}
					} else if (i == 0) {
						if (nums[i] < target) {
							result = nums[i] + nums[j+1];
							if (result == target) {
								location1 = i;
								location2 = j;
								flag = true;
							}
						}
					}
					if (flag) {
						break;
					}
				}

			}
			resultNumsIndices[0] = location1;
			resultNumsIndices[1] = location2;
			return resultNumsIndices;
		}
	}
	
	public static void main(String[] args) {
		int[]  result = Solution.twoSum(new int[] {0,4,3,0}, 0);
		for(int i=0; i<result.length; i++) {
			System.out.println("Solution ARRAY : "+result[i]);
		}
		
	}

}
