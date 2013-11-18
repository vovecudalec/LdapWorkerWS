package ru.crocket.ws.ldapworker;
import java.io.*;
import java.util.Properties;
import javax.swing.JOptionPane;


public class Config {

    static Properties properties;

    public Config()
    {
        boolean result = true;
        try
        {
            properties = new Properties();
            FileInputStream is = new FileInputStream("D:\\temp\\LdapWorkerWS\\src\\main\\resource\\app.properties");
            InputStreamReader isr = new InputStreamReader(is, "cp1251");
            properties.load(isr);
        }
        catch(FileNotFoundException notfound)
        {
            result = false;
        }
        catch(IOException ioexc)
        {
            result = false;
        }
    }

    public static String getProperty(String key)
    {
        if(properties.containsValue(key))
            return properties.getProperty(key).trim();
        else return null;
    }
}
