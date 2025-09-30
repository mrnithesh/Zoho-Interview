import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] inpt1 = {"2","1","+","3","*"};
        String [] inpt2 ={"4","13","5","/","+"};
        String[] inpt3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println("Answer :"+evaluate(inpt1));
        System.out.println("Answer :"+evaluate(inpt2));
        System.out.println("Answer :"+evaluate(inpt3));

    }
    public static int evaluate(String inpt[]){ //reverse polish -> postfix
        Stack<String> stack = new Stack<>();
        for (String c:inpt){
            if (c.equals("+") ||c.equals("-") || c.equals("*") || c.equals("/")){ // only valid operations
                if (stack.size()>=2){
                    int a = Integer.parseInt(stack.pop());
                    int b= Integer.parseInt(stack.pop());
                    switch (c) {
                        case "+" -> stack.push(String.valueOf(a + b));
                        case "-" -> stack.push(String.valueOf(a - b));
                        case "*" -> stack.push(String.valueOf(a * b));
                        case "/" -> stack.push(String.valueOf(b / a));
                    }
                }
            }
            else{
                stack.push(c);
            }
            System.out.println(stack);
        }
        return Integer.parseInt(stack.peek());
    }
}
