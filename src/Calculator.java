public class Calculator {
    private double result;
    private double currentOperand;
    private char currentOperator;
    private boolean isNewOperation;

    public Calculator() {
        result = 0;
        currentOperand = 0;
        currentOperator = ' ';
        isNewOperation = true;
}

    public void performOperation(double operand) {
        if (isNewOperation) {
            result = operand;
            isNewOperation = false;
        } else {
            performCurrentOperation();
            result = currentOperand;
        }
    }

    public void performOperation(char operator) {
        if (operator == '=') {
            performCurrentOperation();
            isNewOperation = true;
        } else {
            currentOperator = operator;
        }
    }

    private void performCurrentOperation() {
        switch (currentOperator) {
            case '+':
                result += currentOperand;
                break;
            case '-':
                result -= currentOperand;
                break;
            case '*':
                result *= currentOperand;
                break;
            case '/':
                if (currentOperand != 0) {
                    result /= currentOperand;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
                break;
        }
    }

    public double getResults() {
        return result;
    }
}

