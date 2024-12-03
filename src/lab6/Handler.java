package lab6;
/**
 * Interface for handling requests in the Chain of Responsibility pattern.
 */
public interface Handler {
    /**
     * Sets the next handler in the chain.
     *
     * @param nextHandler the next handler in the chain
     */
    void setNextHandler(Handler nextHandler);
    /**
     * Handles the validation process for a given document.
     *
     * @param document the document to validate
     * @throws Exception if validation fails
     */
    void handle(Document document) throws Exception;
}
