public enum Operation {


    Addition('+'), Subtract('-'), Multiply('*'), Division('/');
    private char c;

    Operation() {

    }

    Operation(char c) {
        this.c = c;
    }

    public double Calculate(double a, double b) {
        if (c == '+') {
            return a + b;
        }
        return -1;
    }
}
