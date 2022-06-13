public class MethodsExercises {
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }
    public static long multiplication(long num1, long num2){
        return num1 * num2;
    }
    public static double division(double num1, double num2){
        return num1 / num2;
    }
    public static int modulus(int dividend, int divisor){
        return dividend % divisor;
    }
    public static int recursion(int x, int y) {
        if (x < y)
            return recursion(y, x);
        else if (y != 0)
            return (x + recursion(x, y - 1));
        else
            return 0;
    }


    public static void main(String[] args) {
        System.out.println(multiplication(10,10));
        System.out.println(addition(33,33));
        System.out.println(division(30,5));
        System.out.println(subtraction(253,135));
        System.out.println(modulus(10, 3));


        System.out.println(recursion(20, 5 ));

    }
}
