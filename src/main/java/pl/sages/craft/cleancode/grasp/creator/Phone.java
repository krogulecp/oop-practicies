package pl.sages.craft.cleancode.grasp.creator;

/**
 * @author krogulecp
 */
class Phone {
    private final Camera camera;
    private final Screen screen;

    public Phone(double cameraMegapixels, double screenSize) {
        this.camera = new Camera(cameraMegapixels);
        this.screen = new Screen(screenSize);
    }

    public Camera getCamera() {
        return camera;
    }

    public Screen getScreen() {
        return screen;
    }
}
