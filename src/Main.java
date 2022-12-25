public class Main {
    public static void main(String[] args) {
        Operation e =Operation.Addition;
        double result = e.Calculate(10 , 19);

        System.out.println(result);
        System.out.println(e.getClass().getName());
        System.out.println(e.getClass().getSuperclass());


    }
}
