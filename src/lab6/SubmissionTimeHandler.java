package lab6;
/**
 * Handler for validating document submission time.
 */
public class SubmissionTimeHandler extends AbstractHandler {
    @Override
    protected boolean process(Document document) {
        System.out.println("Перевірка часу подання..");
        return document.isSubmittedOnTime();
    }
}

