package edu.upc.dsa;

import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * Created by Josean on 09/10/2017.
 */
public class I18N {

    // private String idioma;
    private static I18N instance = null;
    private static HashMap<String, ResourceBundle> rb;
    private static final String RESOURCES="edu.upc.dsa.i18n";


    private I18N (){

        rb = new HashMap<String, ResourceBundle>();

        ResourceBundle messages = ResourceBundle.getBundle(RESOURCES+"message_en");
        rb.put("en",messages);
        ResourceBundle messages2 = ResourceBundle.getBundle(RESOURCES+"message_ca");
        rb.put("ca",messages2);
        ResourceBundle messages3 = ResourceBundle.getBundle(RESOURCES+"message_es");
        rb.put("es",messages3);
    }

    public String getData (String key, String language){
        return rb.get(language).getString(key);
    }

    public static I18N getInstance(){
        if (instance == null)
            instance= new I18N();
        return instance;
    }


}
