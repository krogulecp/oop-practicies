package pl.sages.craft.cleancode.designpatterns.builder;

/**
 * @author krogulecp
 */
// TODO Refaktor z wykorzystaniem wzorca builder
class Film {
    private String title;
    private int length;
    private String director;
    private Category category;
    private Country madeIn;

    private Film() { }

    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
    public Category getCategory() {
        return category;
    }
    public Country getMadeIn() {
        return madeIn;
    }

    FilmBilder filmBilder = new FilmBilder();

    public FilmBilder setTitle(String title) {
        this.title = title;
        return filmBilder;
    }

    public FilmBilder setLength(int length) {
        this.length = length;
        return filmBilder;
    }

    public FilmBilder setDirector(String director) {
        this.director = director;
        return filmBilder;
    }

    public FilmBilder setCategory(Category category) {
        this.category = category;
        return filmBilder;
    }

    public FilmBilder setMadeIn(Country madeIn) {
        this.madeIn = madeIn;
        return filmBilder;
    }

    static class FilmBilder{
        Film film = new Film();
        public Film build(){ return film; }
    }

    private enum  Category {
        COMEDY, THRILLER, ACTION;
    }

    private enum  Country {
        USA, POLAND, FRANCE, NORWAY, GERMANY, UK;
    }
}
