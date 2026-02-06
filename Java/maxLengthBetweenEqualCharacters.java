class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstindex=new int[26];
        Arrays.fill(firstindex,-1);
        int max=-1;
        for(int i=0;i<s.length();i++){
            if(firstindex[s.charAt(i)-'a']==-1){
                firstindex[s.charAt(i)-'a']=i;
            }
            else{
                max=Math.max(max,i-firstindex[s.charAt(i)-'a']-1);
            }
           
        }
         return max;
    }
}
    }
}