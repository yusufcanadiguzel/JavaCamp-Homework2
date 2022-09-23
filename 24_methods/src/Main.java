public class Main {
    public static void main(String[] args) throws Exception {
        
        String name = "X";

        sayMyName();
        
        sayYourName(name);
    }

    public static void sayMyName(){
        System.out.println("My name.");
    }

    public static void sayYourName(String name){
        System.out.println(name);
    }

}
