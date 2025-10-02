public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("--- Document Converter Application ---");

        System.out.println("\nUsing PDF Converter:");
        DocumentConverter pdfConverter = new PdfConverter();
        pdfConverter.processDocument();

        System.out.println("\nUsing Word Converter:");
        DocumentConverter wordConverter = new WordConverter();
        wordConverter.processDocument();
    }
}