package Overloaded;

public class Main {
    public static void main(String[] args) {
        DocViewer doc1 = new DocViewer();
        DocViewer doc2 = new DocViewer("Sample Document");
        DocViewer doc3 = new DocViewer("Important Document", 10, true, "pdf");

        doc1.printDocumentInfo();
        doc2.printDocumentInfo();
        doc3.printDocumentInfo();
    }
}
