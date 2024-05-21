package Test;

public class ConverterTemp {

    public double t(double temp, String from, String to) {
        double t=0;

        if (from.equals("c")) {
            if (to.equals("k")) {
                t = temp + 273.15;
            } else if (to.equals("f")) {
                t = (temp * 1.8) + 32;
            }
        } else if (from.equals("k")) {
            if (to.equals("c")) {
                t = temp - 273.15;
            } else if (to.equals("f")) {
                t = (temp - 273.15) * 1.8 + 32;
            }
        } else if (from.equals("f")) {
            if (to.equals("c")) {
                t = (temp - 32) / 1.8;
            } else if (to.equals("k")) {
                t = (temp - 32) / 1.8 + 273.15;
            }
        }
        return t;
    }



}
