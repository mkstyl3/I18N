package edu.upc.dsa;


import org.junit.Assert;
import org.junit.Test;

public class I18NTest
{
    @Test
    public void getDataTest() {

        String stringEN = I18N.getInstance().getData("T1","en");
        Assert.assertEquals(stringEN, "Hello");

        String stringES = I18N.getInstance().getData("T2","es");
        Assert.assertEquals(stringES, "Hola");

        String stringCA = I18N.getInstance().getData("T3","ca");
        Assert.assertEquals(stringCA, "Hola");

    }

}
