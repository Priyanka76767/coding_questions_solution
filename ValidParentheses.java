class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for (int i=0;i<s.length();i++){
            char qt=s.charAt(i);
            if (!st.isEmpty()){
            if ((qt==')' && st.peek()=='(')||(qt=='}' && st.peek()=='{')||(qt==']' && st.peek()=='[')){
                st.pop();
            }
            else{
                st.push(qt);
            }}
            else{
                st.push(qt);
            }
        }
        
        if (st.isEmpty()){
            return true;
        }
        else
            return false;
    }
}
