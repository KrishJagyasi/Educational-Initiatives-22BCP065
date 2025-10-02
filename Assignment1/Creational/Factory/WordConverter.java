public class WordConverter extends DocumentConverter {
    @Override
    protected Document createDocument() {
        return new WordDocument();
    }
}