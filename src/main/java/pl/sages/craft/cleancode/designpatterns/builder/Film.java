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

    private Film() {
    }

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

    private enum  Category {
        COMEDY, THRILLER, ACTION;
    }

    private enum  Country {
        USA, POLAND, FRANCE, NORWAY, GERMANY, UK;
    }

    static class FilmBuilder{
        private Film film = new Film();

        public FilmBuilder setTitle(String title) {
            this.film.title = title;
            return this;
        }
        public FilmBuilder setLength(int length) {
            this.film.length = length;
            return this;
        }
        public FilmBuilder setDirector(String director) {
            this.film.director = director;
            return this;
        }
        public FilmBuilder setCategory(Category category) {
            this.film.category = category;
            return this;
        }
        public FilmBuilder setMadeIn(Country madeIn) {
            this.film.madeIn = madeIn;
            return this;
        }

        public Film build(){
            return this.film;
        }

    }

}
