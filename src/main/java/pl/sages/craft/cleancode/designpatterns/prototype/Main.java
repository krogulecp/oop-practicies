package pl.sages.craft.cleancode.designpatterns.prototype;

/**
 * @author krogulecp
 */
class Main {

    public static void main(String[] args) {
        Sheep sheep = new BasicSheep("dolly");
        Sheep sheepCopy = sheep.makeCopy();

        System.out.println(sheep == sheepCopy);
        System.out.println(sheep.equals(sheepCopy));
    }
}
