class Solution {
    public int splitNum(int num) {
        int[] digit=new int[10];
        while(num>0){
            digit[num%10]++;
            num/=10;
        }
        
        int a=0;
        int b=0;
         int i=0;
        int turn=0;
         while(i<digit.length){
             if(digit[i]>0){
                 if(turn%2==0){
                     a=a*10+i;
                 }else{
                     b=b*10+i;
                 }
                 digit[i]--;
                 turn++;
             }else i++;
         }
        
        return a+b;
    }
}