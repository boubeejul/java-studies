public class Calculator {

    public int add(int n1, int n2) {
        return n1+n2; 
    }

    // method overloading
    public int add(int n1, int n2, int n3) {
        return n1+n2+n3; 
    }

    public int subtract(int n1, int n2) {
        return n1-n2; 
    }

    public int multiply(int n1, int n2) {
        return n1*n2; 
    }

    public int divide(int n1, int n2) {
        return n1/n2; 
    }
}