
public class PracticeArrays {

    public static void main(String[] args) {
        try {
            int num = 2/0;
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }finally{
            System.out.println("Using exception here");
        }
    }
}
