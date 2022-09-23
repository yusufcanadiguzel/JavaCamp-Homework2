public class Main {
    public static void main(String[] args) throws Exception {
        var result = 0;

        result = sum(1, 2, 3, 6, 8);

        System.out.println("Sonuç : " + result);
    }

    public static int sum(int... numbers){
        var result = 0;

        for (var number : numbers) {
            result += number;
        }

        return result;
    }
}
