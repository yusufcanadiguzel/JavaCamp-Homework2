public class MathManager {
    public int add(int number1, int number2){
        var result = number1 + number2;

        return result;
    }

    public int add(int... numbers){
        var result = 0;

        for (int number : numbers) {
            result += number;
        }

        return result;
    }
}
