public abstract class DocumentConverter {
    // This is the "Factory Method"
    protected abstract Document createDocument();

    public void processDocument() {
        Document doc = createDocument();
        doc.open();
        // ... some processing logic ...
        System.out.println("Processing the document...");
        doc.save();
    }
}