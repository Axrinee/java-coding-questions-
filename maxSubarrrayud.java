import java.util.Scanner;
public class maxSubarrrayud {
    public static int subarray(int[]nums){
        int maxi = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0; i<nums.length;i++){
            sum += nums[i];
            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0 ;i<T;i++){
            int n = sc.nextInt();
            int [] nums = new int[n];
            for(int j = 0 ;j<nums.length;j++){
                nums[j]=sc.nextInt();
            }
            System.out.println(subarray(nums));
        }
        sc.close();
    }
}
