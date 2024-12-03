package lab6;
/**
 * Handler for validating document confidentiality.
 */
public class ConfidentialityHandler extends AbstractHandler {
    @Override
    protected boolean process(Document document) {
        System.out.println("Перевірка конфіденційності...");
        return document.isConfidential();
    }
}

