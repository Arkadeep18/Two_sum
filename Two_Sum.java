package practice_prev;
import java.util.Arrays;
public class Two_Sum {
	static int [] twoS(int nums[], int target) {
		int n = nums.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]+nums[j] == target) {
					return new int [] {i,j};
				}
			}
		}
			return new int[] {};
	}
	public static void main(String[] args) {
		int nums [] = {10,12,13,14,15,16};
		
		int ans[]=twoS(nums, 25);
		System.out.println(Arrays.toString(ans));
	}
}
