class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> l=new ArrayList<>();
        while(n>0){
            l.add(n%10);
            n=n/10;
        }
        Collections.sort(l);
        if(l.size()==1){
            return l.get(0);
        }
        if(l.isEmpty()) return 0;
        else{
            return l.get(l.size()-1)*l.get(l.size()-2);
        }
    }
}