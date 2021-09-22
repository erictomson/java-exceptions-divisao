public class Main {
    public static void main(String[] args) {
        CalculoMatematico calculadora = new CalculoMatematico();
        try {
            System.out.println("Resultado da divisão: " + calculadora.dividir(4,2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
