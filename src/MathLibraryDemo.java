public class MathLibraryDemo {
    public static void main(String[] args) {


        double base = 2;
        int exponent = 3;
        double powerResult = Math.pow(base, exponent);
        System.out.println("Power: " + powerResult);


        double numberForSqrt = 16;
        double sqrtResult = Math.sqrt(numberForSqrt);
        System.out.println("Square Root: " + sqrtResult);


        double decimalNumber = 5.67;
        long roundedNumber = Math.round(decimalNumber);
        System.out.println("Rounded Number: " + roundedNumber);


        double randomNumber = Math.random();
        System.out.println("Random Number: " + randomNumber); 
    }
}
