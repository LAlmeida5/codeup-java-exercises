public class MethodsExercises {
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static int division(int num1, int num2){
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

        int x = 15, y = 5;
        System.out.println(recursion(x, y ));

    }
}
