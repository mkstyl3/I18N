package edu.upc.dsa;


import org.junit.Assert;
import org.junit.Test;

import java.util.ResourceBundle;

/**
 * Unit test for simple App.
 */
public class I18NTest
{
    @Test
    ResourceBundle getDataTest() {
        ResourceBundle rb = I18N.getInstance().getData("T1","ca");
    }

}
