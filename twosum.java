public class twosum{
    public static String TwoSum(int n, int arr[], int target){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return "Yes, The indices are: " + i + " " + j;

                }

            }
            
        }
        return "No";

    }
    public static void main(String[] args){
        int arr[]={2,7,11,15};
        int n = arr.length;
        int target = 22;
        String result = TwoSum(n,arr,target);
        System.out.println(result);
        
    }
}