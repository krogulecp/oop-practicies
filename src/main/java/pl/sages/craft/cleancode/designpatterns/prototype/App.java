package pl.sages.craft.cleancode.designpatterns.prototype;

public class App {
    public static void main(String[] args) {
        ConcreteSheep concreteSheep = new ConcreteSheep("Lola");
        System.out.println(concreteSheep);

        ConcreteSheep cloneConcreteSheep = concreteSheep.clone();
        System.out.println(cloneConcreteSheep);
    }
}
