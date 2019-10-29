package pl.sages.craft.cleancode.grasp.creator;

/**
 * @author krogulecp
 */
class Phone {
    private final Camera camera;
    private final Screen screen;

    public Phone(Camera camera, Screen screen) {
        this.camera = camera;
        this.screen = screen;
    }

    public Camera getCamera() {
        return camera;
    }

    public Screen getScreen() {
        return screen;
    }
}
