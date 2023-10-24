import org.slf4j.*;

public class Ovn1 {
    private static Logger logger = LoggerFactory.getLogger(Ovn1.class);

    public static void main(String[] args) {
        logger.info("Detta är information!");        
        logger.warn("Detta är en varning!");
        logger.debug("Detta är ett debugmeddelande.");
    }
}
