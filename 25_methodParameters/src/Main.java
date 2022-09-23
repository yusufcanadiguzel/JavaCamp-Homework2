public class Main {
    public static void main(String[] args) throws Exception {
        int number1 = 10;
        int number2 = 12;

        int result = sum(number1, number2);

        System.out.println("Sonuç : " + result);
    }

    public static int sum(int number1, int number2){
        int result = number1 + number2;

        return result;
    }
}
