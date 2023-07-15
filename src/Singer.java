public class Singer extends Person{
    private String bandName;
    public Singer(String name, String designation) {
        super(name, designation);
    }
    public void learn(){
        System.out.println("Can learn.");
    }
    public void walk() {
        System.out.println("Can walk.");
    }
    public void eat() {
        System.out.println("Can eat.");
    }
    public void singing() {
        System.out.println("Can singing.");
    }
    public void playGitar() {
        System.out.println("Can play gitar.");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
