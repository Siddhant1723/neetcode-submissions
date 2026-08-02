class Solution {
    public int evalRPN(String[] tokens) {
    Deque<Integer> stack=new ArrayDeque<>();
    int num1,num2,op;
    for(int i=0;i<tokens.length;i++){
        if(!tokens[i].equals("+")&&!tokens[i].equals("-")&&!tokens[i].equals("/")&&!tokens[i].equals("*")){
            stack.push(Integer.parseInt(tokens[i]));
        }
        else{
            if(stack.peek()==null)
            return 0;
            num1=stack.pop();
            if(stack.peek()==null)
            return 0;
            num2=stack.pop();
            switch(tokens[i]){
                case "+":
                    op=num1+num2;
                    stack.push(op);
                    break;
                case "-":
                    op=num2-num1;
                    stack.push(op);
                    break;
                case "/":
                    op=num2/num1;
                    stack.push(op);
                    break;
                case "*":
                    op=num1*num2;
                    stack.push(op);
                    break;
            }
        }
    }
    return stack.peek();
    }
}
