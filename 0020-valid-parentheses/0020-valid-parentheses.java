class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char curr=stack.pop();
                    switch (curr){
                        case '(':
                            if(ch!=')'){
                                return false;
                            }
                            break;
                        case '[':
                            if(ch!=']'){
                                return false;
                            }
                            break;
                        default:
                            if(ch!='}'){
                                return false;
                            }
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}