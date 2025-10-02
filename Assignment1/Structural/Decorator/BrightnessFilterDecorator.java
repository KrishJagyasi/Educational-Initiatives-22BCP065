public class BrightnessFilterDecorator extends PhotoDecorator {
    public BrightnessFilterDecorator(IPhoto photo) {
        super(photo);
    }

    @Override
    public String render() {
        // Add new behavior before or after delegating
        return super.render() + " + Brightness filter";
    }
}