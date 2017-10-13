package edu.upc.dsa;

import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * Created by Josean on 09/10/2017.
 */
public class I18N {

    private static I18N instance;
    private HashMap<String, ResourceBundle> rb;

    public static I18N getInstance(){
        if (instance == null)
            instance= new I18N();
        return instance;
    }

    private I18N (){

        rb = new HashMap<String, ResourceBundle>();

        ResourceBundle en_Bundle = ResourceBundle.getBundle("en");
        rb.put("en",en_Bundle);
        ResourceBundle ca_Bundle = ResourceBundle.getBundle("ca");
        rb.put("ca",ca_Bundle);
        ResourceBundle es_Bundle = ResourceBundle.getBundle("es");
        rb.put("es",es_Bundle);
    }

    public String getData (String bundleKey, String hashKey){
        return rb.get(hashKey).getString(bundleKey);
    }







}
