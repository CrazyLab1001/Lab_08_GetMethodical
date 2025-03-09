public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius and Fahrenheit Conversion graph");
        System.out.printf("\n%5s%15s", "Celsius", "Fahrenheit");
        double Fahrenheit;
        double Celsius;
        for (Celsius = -100; Celsius <= 100; Celsius++) {
            Fahrenheit = CtoFConverterRealtempC(Celsius);
        System.out.printf("\n%10.2f%10.2f", Celsius, Fahrenheit);}

    }
    private static double CtoFConverterRealtempC (double Celsius) {
    double Fahrenheit = (Celsius * ((double) 9 /5) + 32);
    return Fahrenheit;}
}
