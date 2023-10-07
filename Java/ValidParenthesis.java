class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> mp = new HashMap<>();
        mp.put(')','(');
        mp.put('}','{');
        mp.put(']','[');

        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek() == mp.get(s.charAt(i))){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}