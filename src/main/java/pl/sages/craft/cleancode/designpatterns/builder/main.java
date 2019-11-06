package pl.sages.craft.cleancode.designpatterns.builder;

public class main {
    public static void main(String[] args) {
        Film film = new Film.FilmBuilder().setTitle("Eagle Eye").setLength(120).build();
        System.out.println(film);
    }
}
