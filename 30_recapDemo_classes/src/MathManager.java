public class MathManager {

    public double add(double... numbers){
        double result = 0;

        for (double number : numbers) {
            result += number;
        }

        return result;
    }

    public double subtract(double... numbers){
        double result = 0;

        for (double number : numbers) {
            result -= number;
        }

        return result;
    }

    public double divide(double number1, double number2){
        double result=0;

        result = number1 / number2;

        return result;
    }

    public double multiply(double number1, double number2){
        double result = 0;

        result = number1 * number2;

        return result;
    }
}
