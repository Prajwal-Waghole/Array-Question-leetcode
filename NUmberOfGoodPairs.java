class Solution {
  public int numIdenticalPairs(int[] nums) {
      int pairs = 0;
      for(int i = 0; i < nums.length; i++){
          for (int j = 1; j < nums.length; j++){
              if(nums[i] == nums[j] && i < j){// index i < j value thats is 01234 
                  pairs = pairs + 1;              //   0 < 1
              }
          }
      }return pairs;
  }
}