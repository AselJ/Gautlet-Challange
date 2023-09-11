public class CalculatorTest {

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.performOperation(10.5);
        myCalc.performOperation('+');
        myCalc.performOperation(5.2);
        myCalc.performOperation('*');
        myCalc.performOperation(10);
        myCalc.performOperation('=');

        double result = myCalc.getResults();
        System.out.println("Result: " + result); // Output: Result: 62.5
    }
}
