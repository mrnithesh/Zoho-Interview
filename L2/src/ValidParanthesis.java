import java.util.*;
public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid(("(]")));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([)"));
    }
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> hm = new HashMap<>(); //mapping brackets
        hm.put('}','{');
        hm.put(']','[');
        hm.put(')','(');
        for (char c: str.toCharArray()){
            if(hm.containsKey(c)){ //closing
                if(!stack.isEmpty() && stack.peek()!=hm.get(c)){
                    return false;
                }else if(!stack.isEmpty() && stack.peek()==hm.get(c) ){
                    stack.pop(); //valid pair
                }
                else{
                    return false;
                }
            }
            else if(hm.containsValue(c)){
                stack.push(c); //opening
            }
            else{
                return false; //anyother character
            }
        }

        return stack.isEmpty();
    }
}
