import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EquationValidator {
    public static boolean isValidEquation(String equation) {

        if (!isValidBracketsPlacement(equation)){
            return false;
        }
        if (!isValidExpression(equation)){
            return false;
        }
        return true;

    }

    public static boolean isValidExpression(String expression) {
        Pattern pattern = Pattern.compile(".*[+\\-*/]{2,}.*");
        Matcher matcher = pattern.matcher(expression);
        return !matcher.matches();
    }

    public static boolean isValidBracketsPlacement(String equation) {
        int openBrackets = 0;
        int closeBrackets = 0;
        for (char ch: equation.toCharArray()) {
            if (ch == '('){
                openBrackets++;
            }else if (ch == ')'){
                closeBrackets++;
            }
            if (closeBrackets > openBrackets){
                return false;
            }
        }
        return openBrackets == closeBrackets;
    }
}
