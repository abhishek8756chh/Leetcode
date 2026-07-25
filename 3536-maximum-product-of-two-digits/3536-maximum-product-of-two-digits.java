class Solution {
    public int maxProduct(int n) {
        int max=0;
        int max2=0;
        int m=n;
        while(n>0){
            int num=n%10;
            n=n/10;
           if(max<=num){
            max2=max;
            max=num;
           }
           else if(num>max2){
            max2=num;
           }
       
        }
        return max*max2;
    }
}