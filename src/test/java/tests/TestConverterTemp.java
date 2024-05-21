package tests;

import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Test.ConverterTemp;
import java.util.Random;


public class TestConverterTemp {

    double randTemp = 0;

    @BeforeMethod
    public void beforeMethod(){
        Random rand = new Random();
        randTemp = rand.nextDouble(100);
    }

    @Test
    public void testOne(){

        ConverterTemp temp = new ConverterTemp();
        double newTemp = temp.t(randTemp,"c","k");
        double expectedTemp = randTemp + 273.15;

        Allure.addAttachment("Random temperature C: ", String.valueOf(randTemp));

        Assert.assertEquals(newTemp, expectedTemp);

        Allure.addAttachment("Converted temperature K: ", String.valueOf(expectedTemp));

    }

    @Test
    public void testTwo() {
        ConverterTemp temp = new ConverterTemp();
        double newTemp = temp.t(randTemp, "c", "f");
        double expectedTemp = (randTemp * 1.8) + 32;

        Allure.addAttachment("Random temperature C : ", String.valueOf(randTemp));

        Assert.assertEquals(newTemp, expectedTemp);

        Allure.addAttachment("Converted temperature F: ", String.valueOf(expectedTemp));
    }

    @Test
    public void testThree() {
        ConverterTemp temp = new ConverterTemp();
        double newTemp = temp.t(randTemp, "k", "c");
        double expectedTemp = randTemp - 273.15;

        Allure.addAttachment("Random temperature K: ", String.valueOf(randTemp));

        Assert.assertEquals(newTemp, expectedTemp);

        Allure.addAttachment("Converted temperature C: ", String.valueOf(expectedTemp));
    }

    @Test
    public void testFour() {
        ConverterTemp temp = new ConverterTemp();
        double newTemp = temp.t(randTemp, "k", "f");
        double expectedTemp = (randTemp - 273.15) * 1.8 + 32;

        Allure.addAttachment("Random temperature K: ", String.valueOf(randTemp));

        Assert.assertEquals(newTemp, expectedTemp);

        Allure.addAttachment("Converted temperature F: ", String.valueOf(expectedTemp));
    }


    @Test
    public void testFive() {
        ConverterTemp temp = new ConverterTemp();
        double newTemp = temp.t(randTemp, "f", "c");
        double expectedTemp = (randTemp - 32) / 1.8;

        Allure.addAttachment("Random temperature F: ", String.valueOf(randTemp));

        Assert.assertEquals(newTemp, expectedTemp);

        Allure.addAttachment("Converted temperature C: ", String.valueOf(expectedTemp));
    }

    @Test
    public void testSix() {
        ConverterTemp temp = new ConverterTemp();
        double newTemp = temp.t(randTemp, "f", "k");
        double expectedTemp = (randTemp - 32) / 1.8 + 273.15;

        Allure.addAttachment("Random temperature F: ", String.valueOf(randTemp));

        Assert.assertEquals(newTemp, expectedTemp);

        Allure.addAttachment("Converted temperature K: ", String.valueOf(expectedTemp));
    }



}
