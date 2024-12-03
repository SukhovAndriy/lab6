package lab6;
/**
 * Client class to demonstrate the Chain of Responsibility pattern.
 * Configures and executes the chain for document validation.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Приклад 1: документ роходить усі перевірки");
        Document validDocument = new Document(true, true, true, true);
        runValidation(validDocument);

        System.out.println("Приклад 2: документ не проходить перевірку конфіденційності");
        Document invalidDocument = new Document(true, true, false, true);
        runValidation(invalidDocument);
    }
    /**
     * Runs validation for a given document using the chain of responsibility.
     *
     * @param document the document to validate
     */
    private static void runValidation(Document document) {
        // Конкретні обробники
        Handler formatHandler = new FormatHandler();
        Handler authorizationHandler = new AuthorizationHandler();
        Handler confidentialityHandler = new ConfidentialityHandler();
        Handler submissionTimeHandler = new SubmissionTimeHandler();
        // Налаштування
        formatHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(confidentialityHandler);
        confidentialityHandler.setNextHandler(submissionTimeHandler);
        // Перевірка
        try {
            System.out.println("Початок перевірки документа..");
            formatHandler.handle(document);
            System.out.println("Документ пройшов усі етапи перевірки");
        } catch (Exception e) {
            System.out.println("Перевірка зупинена: " + e.getMessage());
        }
    }
}
