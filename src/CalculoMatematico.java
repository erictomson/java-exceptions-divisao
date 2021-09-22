public class CalculoMatematico {

    public int dividir(int dividendo, int divisor) throws ArithmeticException {
        if(divisor==0) {
            throw new ArithmeticException("Dividor igual a zero!");
        }
        return dividendo/divisor;
    }

}
