package pl.sages.craft.cleancode.classes.ex1;

//TODO Extract class from this class
class T2PersonRaw {
    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getName() {
        return name;
    }
    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") " + officeNumber);
    }
    public String getOfficeAreaCode() {
        return officeAreaCode;
    }
    public void setOfficeAreaCode(String arg) {
        officeAreaCode = arg;
    }
    public String getOfficeNumber() {
        return officeNumber;
    }
    public void setOfficeNumber(String arg) {
        officeNumber = arg;
    }
}