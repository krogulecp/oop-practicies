package pl.sages.craft.cleancode.designpatterns.builder;

/**
 * @author krogulecp
 */
// TODO Refaktor z wykorzystaniem wzorca builder
class Film {
    private String title;

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", director='" + director + '\'' +
                ", category=" + category +
                ", madeIn=" + madeIn +
                '}';
    }

    private int length;
    private String director;
    private Category category;
    private Country madeIn;

    static class FilmBuilder{
        private Film film;

        public FilmBuilder() {
            this.film = new Film();
        }
        public Film build(){
            return film;
        }

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

    public Country getMadeIn() {
        return madeIn;
    }

    public Category getCategory() {
        return category;
    }

}

enum Category {
    COMEDY, THRILLER, ACTION;
}

enum  Country {
    USA, POLAND, FRANCE, NORWAY, GERMANY, UK;
}
