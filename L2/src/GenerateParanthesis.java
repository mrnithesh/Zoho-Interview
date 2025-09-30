import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(result, "", 0, 0, n);
        return result;
    }


    private static void generateParenthesisHelper(List<String> result, String currentString, int openCount, int closeCount, int maxPairs) {
        if (currentString.length() == 2 * maxPairs) {
            result.add(currentString);
            return;
        }
        if (openCount < maxPairs) {
            generateParenthesisHelper(result, currentString + "(", openCount + 1, closeCount, maxPairs);
        }

        if (closeCount < openCount) {
            generateParenthesisHelper(result, currentString + ")", openCount, closeCount + 1, maxPairs);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
//        System.out.println(generateParenthesis(5));
    }
}