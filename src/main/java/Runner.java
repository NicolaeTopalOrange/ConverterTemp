import Test.ConverterTemp;

public class Runner {
    public static void main(String[] args) {

        ConverterTemp converterTemp = new ConverterTemp();

        double a= converterTemp.t(25,"c","k");
        System.out.println(a);
    }
}