
//Enum arxa planda bu cur isleyir
public class Operation2 {
    public static final Operation2 Addition = new Operation2('+');
    public static final Operation2 Subtraction = new Operation2('-');
    public static final Operation2 Multiply = new Operation2('*');
    public static final Operation2 Division = new Operation2('/');
    private char c;

    Operation2() {

    }

    Operation2(char c) {
        this.c = c;
    }

    public char getOperationSymbol() {
        return this.c;
    }

    public double Calculate(double a, double b) {
        if (c == '+') {
            return a + b;
        }
        return -1;
    }
}
