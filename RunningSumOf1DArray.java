//this is mu first program which i wrote myself.....
class Solution {
  public int[] runningSum(int[] nums) {
      int i ;
      int[] ans = new int[nums.length];
      ans[0] = nums[0];
      for(i = 1; i < nums.length; i++){
          ans[i] = nums[i-1] + nums[i];
          ans[i] = ans[i-1] + nums[i];
      }
      return ans;
  }
}

//this is enhanced with less space complexity
class Solution1 {
  public int[] runningSum(int[] nums) {
      int n = nums.length;
      for(int i = 1; i < n; i++){
          nums[i] = nums[i] + nums[i-1];
      }
      return nums;
  }
} 
