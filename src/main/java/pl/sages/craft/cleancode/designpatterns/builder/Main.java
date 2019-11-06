package pl.sages.craft.cleancode.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Film.FilmBuilder builder = new Film.FilmBuilder();
        Film film = builder.setTitle("Tytuł").setCategory(Category.ACTION).setDirector("Reżyser").setLength(60).setMadeIn(Country.FRANCE).build();

        System.out.println(film);
    }
}
