///////////////////////////////////////////////////////////////////////////
// Run app testing from here
///////////////////////////////////////////////////////////////////////////

import com.dipak.logger.Logger;
import com.dipak.logger.model.Properties;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        try {
            Properties p = logger.getProperties("logger.properties");
            String name = p.getValue("name");
            String lastname = p.getValue("lastname");
            String age = p.getValue("age");
            System.out.println(name + " " + lastname);
            System.out.println("age: " + age);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
