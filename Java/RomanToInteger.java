class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int sum = 0;
        int i = s.length() - 1;
        while(i>=0){
            char ch = s.charAt(i);
            if(i==0){
                sum+=mp.get(ch);
                break;
            }
            int t1 = mp.get(ch);
            char c = s.charAt(i-1);
            int t2 = mp.get(c);
            if(t1>t2){
                sum = sum+t1-t2;
                i=i-2;
            }else{
                sum+=t1;
                i--;
            }
        }

        return sum;
    }
}