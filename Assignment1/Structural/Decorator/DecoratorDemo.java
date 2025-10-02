public class DecoratorDemo {
    public static void main(String[] args) {
        System.out.println("--- Photo Filter Application ---");

        // Start with a basic photo
        IPhoto photo = new BasicPhoto();
        System.out.println("Original photo: " + photo.render());

        // Decorate it with a brightness filter
        IPhoto brightPhoto = new BrightnessFilterDecorator(photo);
        System.out.println("With brightness: " + brightPhoto.render());

        // Decorate it further with a sepia filter
        IPhoto finalPhoto = new SepiaFilterDecorator(brightPhoto);
        System.out.println("With brightness and sepia: " + finalPhoto.render());

        // We can also stack them all at once
        System.out.println("\nStacking all filters at once:");
        IPhoto fullyFiltered = new SepiaFilterDecorator(new BrightnessFilterDecorator(new BasicPhoto()));
        System.out.println("Final image: " + fullyFiltered.render());
    }
}