package lab6;
/**
 * Represents a document to be validated by the handlers.
 */
public class Document {
    /**
     * Indicates if the document format is valid.
     */
    private boolean validFormat;
    /**
     * Indicates if the document is authorized.
     */
    private boolean authorized;
    /**
     * Indicates if the document meets confidentiality requirements.
     */
    private boolean confidential;
    /**
     * Indicates if the document was submitted on time.
     */
    private boolean submittedOnTime;
    /**
     * Constructor to initialize document properties.
     * @param validFormat true if the document format is valid
     * @param authorized true if the document is authorized
     * @param confidential true if the document meets confidentiality requirements
     * @param submittedOnTime true if the document was submitted on time
     */
    public Document(boolean validFormat, boolean authorized, boolean confidential, boolean submittedOnTime) {
        this.validFormat = validFormat;
        this.authorized = authorized;
        this.confidential = confidential;
        this.submittedOnTime = submittedOnTime;
    }
    /**
     * Checks if the document format is valid.
     * @return true if the format is valid
     */
    public boolean isValidFormat() {
        return validFormat;
    }
    /**
     * Checks if the document is authorized.
     * @return true if the document is authorized
     */
    public boolean isAuthorized() {
        return authorized;
    }
    /**
     * Checks if the document meets confidentiality requirements.
     * @return true if the document is confidential
     */
    public boolean isConfidential() {
        return confidential;
    }
    /**
     * Checks if the document was submitted on time.
     * @return true if the document was submitted on time
     */
    public boolean isSubmittedOnTime() {
        return submittedOnTime;
    }
}

