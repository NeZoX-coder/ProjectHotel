import org.junit.jupiter.api.Test;
import ru.sfedu.ClientHotel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;


public class TestClientHotel {

    private static final Logger log = LogManager.getLogger(TestClientHotel.class.getName());
    private static final Logger logClient = LogManager.getLogger(ClientHotel.class.getName());


    @Test
    void TestMain() {
        try {
            log.info("TEST");
            logClient.info("Launching the application...");
            logClient.info(
                    "Operating System: " + System.getProperty("os.name") + " "
                            + System.getProperty("os.version")
            );
            logClient.info("JRE: " + System.getProperty("java.version"));
            logClient.info("Java Launched From: " + System.getProperty("java.home"));
            logClient.info("Class Path: " + System.getProperty("java.class.path"));
            logClient.info("Library Path: " + System.getProperty("java.library.path"));
            logClient.info("User Home Directory: " + System.getProperty("user.home"));
            logClient.info("User Working Directory: " + System.getProperty("user.dir"));
            logClient.info("Test INFO logging.");
            ClientHotel.main(new String[]{""});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
