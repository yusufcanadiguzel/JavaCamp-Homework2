public class Main {
    public static void main(String[] args) throws Exception {
        
        //Value Types
        int number1 = 10;
        int number2 = 20;

        number2 = number1;
        number1 = 0;

        System.out.println(number2);


        //Reference Types
        int[] numbers1 = new int[] {1, 2, 3};
        int[] numbers2 = new int[] {10, 20, 30};

        numbers2 = numbers1;
        numbers1[0] = 100;

        System.out.println(numbers2[0]);
    }
}
