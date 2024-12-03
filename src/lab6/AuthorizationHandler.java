package lab6;
/**
 * Handler for validating document authorization.
 */
public class AuthorizationHandler extends AbstractHandler {
    @Override
    protected boolean process(Document document) {
        System.out.println("Перевірка авторизації..");
        return document.isAuthorized();
    }
}

