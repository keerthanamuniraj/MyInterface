
class MyCalculator implements AdvancedArithmetic{
    
    public int divisorSum (int n){
        int[] divisor_arr = new int[20];
        int count=0,sum=0;
        for (int i =1;i<=n;i++){
            if ((n%i)==0) {
                divisor_arr[count]=i;
                count++;
            }    
        }
        for (int i=0;i<=count;i++)  {
            sum +=divisor_arr[i];
        }  
       return sum;
    }
} 

