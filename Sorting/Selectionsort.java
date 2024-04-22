import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int nums[]={4,6,2,7,3,0,2,8,9,7,1};
        for(int i=0;i<nums.length-1;i++){
            int small=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[small]){
                    small=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[small];
            nums[small]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}