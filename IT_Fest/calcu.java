package IT_Fest;

import java.util.Scanner;
import java.util.Stack;

public class calcu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strArr = in.nextLine();
        System.out.println(calculator(strArr));
    }

    public static Integer calculator(String statement) {
        var arr = statement.split(" ");
        Stack<Integer> operands = new Stack<>();

        for (String str : arr) {
            if (str.trim().equals("")) {
                continue;
            }

            switch (str) {
                case "+":
                case "-":
                case "*":
                case "/":
                    double right = operands.pop();
                    double left = operands.pop();
                    double value = 0;
                    switch (str) {
                        case "+":
                            value = left + right;
                            break;
                        case "-":
                            value = left - right;
                            break;
                        case "*":
                            value = left * right;
                            break;
                        case "/":
                            value = left / right;
                            break;
                        default:
                            break;
                    }
                    operands.push((int) value);
                    break;
                default:
                    operands.push(Integer.parseInt(str));
                    break;
            }
        }
        return operands.pop();
    }
}
