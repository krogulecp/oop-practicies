package pl.sages.craft.cleancode.grasp.coupling;

/**
 * @author krogulecp
 */
//TODO Jakie są problemy z tym kodem? Co zrobić, żeby je rozwiązać?
class ListFilms {

    private Horror horror;
    private Comedy comedy;

    public ListFilms(Horror horror, Comedy comedy) {
        this.horror = horror;
        this.comedy = comedy;
    }

    public void displayFilms(){
        System.out.println(horror);
        System.out.println(comedy);
    }

    public Horror getHorror() {
        return horror;
    }

    public void setHorror(Horror horror) {
        this.horror = horror;
    }

    public Comedy getComedy() {
        return comedy;
    }

    public void setComedy(Comedy comedy) {
        this.comedy = comedy;
    }
}
