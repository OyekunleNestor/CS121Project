package Overloaded;

public class DocViewer {
    private final String document;
    private final int pageCount;
    private final boolean isEncrypted;
    private final String fileType;

    public DocViewer() {
        this.document = "Untitled";
        this.pageCount = 0;
        this.isEncrypted = false;
        this.fileType = "txt";
    }

    public DocViewer(String document) {
        this.document = document;
        this.pageCount = 1;
        this.isEncrypted = false;
        this.fileType = "txt";
    }

    public DocViewer(String document, int pageCount, boolean isEncrypted, String fileType) {
        this.document = document;
        this.pageCount = pageCount;
        this.isEncrypted = isEncrypted;
        this.fileType = fileType;
    }

    // Getter and Setter methods (not shown in the code above)

    public void printDocumentInfo() {
        System.out.println("Document: " + document);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Encrypted: " + isEncrypted);
        System.out.println("File Type: " + fileType);
    }
}
