package edu.upc.dsa;



/**
 * Created by Josean on 09/10/2017.
 */
public class Main {

    public static void main( String [] args) {
        System.out.println(I18N.getInstance().getData("T1", "en"));
        System.out.println(I18N.getInstance().getData("T2", "es"));
        System.out.println(I18N.getInstance().getData("T3", "ca"));
    }
}
