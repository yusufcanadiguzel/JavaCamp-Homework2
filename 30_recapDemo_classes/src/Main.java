public class Main {
    public static void main(String[] args) throws Exception {
        MathManager mathManager = new MathManager();

        System.out.println(mathManager.add(1, 2, 3, 4, 5));

        System.out.println(mathManager.divide(6, 3));

        System.out.println(mathManager.subtract(1, 2, 3, 4, 5));

        System.out.println(mathManager.multiply(5, 10));
    }
}
