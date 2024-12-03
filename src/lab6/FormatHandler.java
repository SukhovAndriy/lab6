package lab6;
/**
 * Handler for validating document format.
 */
public class FormatHandler extends AbstractHandler {
    @Override
    protected boolean process(Document document) {
        System.out.println("Перевірка формату...");
        return document.isValidFormat();
    }
}

