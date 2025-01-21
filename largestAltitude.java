/*This is my code 77/80 test cases were passed--->
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain[0];
        int [] ans = new int[gain.length + 1];

        ans[0] = 0;
        for(int i = 1; i < gain.length; i++){
            n = n + gain[i];
            ans[i] = n;
        }

        int alt = ans[0];
        for(int i = 0; i < ans.length; i++){
            if(ans[i] > alt){
                alt = ans[i];
            } 
        }
        return alt;
    }
}
*///this was also in my mind, but i got stuck at -- MAth.max() part --
class Solution{
  public int largestAltitude(int[] gain){
      int n = 0;
      int alt = 0;

      for(int i = 0; i < gain.length; i++){
          n += gain[i];
          alt = Math.max(n , alt);
      }
      return alt;
  }
}