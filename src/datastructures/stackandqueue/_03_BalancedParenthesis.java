package datastructures.stackandqueue;

import java.util.Stack;

public class _03_BalancedParenthesis {

    public static boolean isParenthesisBalanced(String exp){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='(' || exp.charAt(i)=='[' || exp.charAt(i)=='{'){
                stack.push(exp.charAt(i));
            }
            else{
                if(stack.isEmpty()) return false;
                Character c = stack.pop();
                if(exp.charAt(i)==')' && c.equals('(') || exp.charAt(i)=='}' && c.equals('{') || exp.charAt(i)==']' && c.equals('[')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp = "(){{{}[]}";
        boolean ans = isParenthesisBalanced(exp);
        System.out.println(ans);
    }
}
