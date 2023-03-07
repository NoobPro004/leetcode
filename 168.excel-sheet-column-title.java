class Solution {
    public String convertToTitle(int n) {
         if(n<=0){
            return "";
        }else{
            StringBuilder s=new StringBuilder();
               while(n!=0){
            n--;
            s.append((char)(n%26 + 'A'));
            n=n/26;
        }
        
        
        
        return s.reverse().toString();
         }
    }
}