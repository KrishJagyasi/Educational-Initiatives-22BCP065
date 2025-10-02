public class PdfConverter extends DocumentConverter {
    @Override
    protected Document createDocument() {
        return new PdfDocument();
    }
}