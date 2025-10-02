public class SepiaFilterDecorator extends PhotoDecorator {
    public SepiaFilterDecorator(IPhoto photo) {
        super(photo);
    }

    @Override
    public String render() {
        return super.render() + " + Sepia filter";
    }
}