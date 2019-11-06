package pl.sages.craft.cleancode.designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Sheep blackSheep = new BlackSheep("Przed Czarna Dolly");
        Sheep blackDolly = blackSheep.clone();

        System.out.println(blackSheep);
        System.out.println(blackDolly);
    }
}
