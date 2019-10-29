package pl.sages.craft.cleancode.grasp.creator;

/**
 * @author krogulecp
 */
class Camera {

    private final double megapixels;

    public Camera(double megapixels) {
        this.megapixels = megapixels;
    }

    public double getMegapixels() {
        return megapixels;
    }
}
