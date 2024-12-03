package lab6;
/**
 * Abstract base class for all handlers in the Chain of Responsibility.
 * Implements common logic for linking and calling handlers in the chain.
 */
public abstract class AbstractHandler implements Handler {
    /**
     * The next handler in the chain.
     */
    protected Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handle(Document document) throws Exception {
        // Обробка документу у поточному обробнику
        if (!process(document)) {
            throw new Exception("Перевірку зупинено на: " + this.getClass().getSimpleName());
        }
        // Документ передається наступному обробнику в ланцюгу, якщо він існує
        if (nextHandler != null) {
            nextHandler.handle(document);
        }
    }
    /**
     * Validates the document against specific criteria.
     * Each concrete handler implements this method with its own logic.
     *
     * @param document the document to validate
     * @return true if the document passes validation, false otherwise
     */
    protected abstract boolean process(Document document);
}
