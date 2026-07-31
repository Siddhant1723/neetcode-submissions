class Solution {
    public boolean isValid(String s) {
        char c;
        int i=0;
        Deque<Character> stack=new ArrayDeque<>();
        while(i<s.length()){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){
               if(stack.isEmpty())
               return false;
               c=stack.pop();
if(s.charAt(i)==')'&&c!='('||s.charAt(i)==']'&&c!='['||s.charAt(i)=='}'&&c!='{')
                return false;
            }
            i++;
        }
        if(stack.isEmpty()==true)
        return true;
        return false;
    }
}
