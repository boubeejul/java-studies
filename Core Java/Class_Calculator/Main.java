public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1, 2, 3));
        System.out.println(calculator.divide(1, 1));
        System.out.println(calculator.subtract(1, 1));
        System.out.println(calculator.multiply(3, 3));
        
    }
}
