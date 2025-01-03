package datastructures.stackandqueue;

import java.util.Stack;

public class _05_InfixToPostFix {
    public static int priority(Character c){
        if(c == '^'){
            return 3;
        }else if(c=='*' || c=='/'){
            return 2;
        }else if(c=='+' || c=='-'){
            return 1;
        }else{
            return -1;
        }
    }

    public static String convertToPostFix(String exp){
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<exp.length();i++){
            if((exp.charAt(i)>='A' && exp.charAt(i)<='Z') ||
                    (exp.charAt(i)>='a' && exp.charAt(i)<='z') ||
                    (exp.charAt(i)>='0' && exp.charAt(i)<='9')){
                ans = ans + exp.charAt(i);
            }
            else if(exp.charAt(i)=='('){
                stack.push(exp.charAt(i));
            }
            else if(exp.charAt(i)==')'){
                while (stack.peek()!='('){
                    ans = ans + stack.pop();
                }
                stack.pop();
            }
            else{
                while (!stack.isEmpty() && priority(stack.peek())>=priority(exp.charAt(i))) {
                    ans = ans + stack.pop();
                }
                stack.push(exp.charAt(i));
            }
        }
        while (!stack.isEmpty()){
            ans = ans + stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        String exp = "(a+b)*(a-b)";
        String ans = convertToPostFix(exp);
        System.out.println(ans);
    }
}
