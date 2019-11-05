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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Country getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(Country madeIn) {
        this.madeIn = madeIn;
    }

    private enum  Category {
        COMEDY, THRILLER, ACTION;
    }

    private enum  Country {
        USA, POLAND, FRANCE, NORWAY, GERMANY, UK;
    }
}
