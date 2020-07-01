package snehaMehta;

import org.apache.log4j.LogManager;
//import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{

    private static final org.apache.log4j.Logger Logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
       // DOMConfigurator.configure("snehaMehtaExceptionHandlingAndLogging-pom.xml");
        Logger.debug("This is a debug");
        Logger.info("This is an info");
        Logger.warn("This is a warning");
        Logger.error("This is an error");
        Logger.fatal("This is fatal");
    }
}
