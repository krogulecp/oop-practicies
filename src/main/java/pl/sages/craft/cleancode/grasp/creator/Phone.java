package pl.sages.craft.cleancode.grasp.creator;

/**
 * @author krogulecp
 */
class Phone {
    private final Camera camera;
    private final Screen screen;

    public Phone(double size, double megapixels) {
        this.camera = new Camera(megapixels);
        this.screen = new Screen(size);
    }

    public Camera getCamera() {
        return camera;
    }

    public Screen getScreen() {
        return screen;
    }
}
