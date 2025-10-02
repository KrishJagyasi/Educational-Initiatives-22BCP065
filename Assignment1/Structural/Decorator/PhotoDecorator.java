public abstract class PhotoDecorator implements IPhoto {
    protected IPhoto wrappedPhoto;

    public PhotoDecorator(IPhoto photo) {
        this.wrappedPhoto = photo;
    }

    @Override
    public String render() {
        return wrappedPhoto.render();
    }
}