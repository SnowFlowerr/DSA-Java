import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int nums[]={4,6,2,7,3,0,2,8,9,7};
        for(int i=1;i<nums.length;i++){
            int current=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>current){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=current;
        }
        System.out.println(Arrays.toString(nums));
    }
}
