public class Programmer extends Person{
    private String companyName;
    public Programmer(String name, String desigantion) {
        super(name, desigantion);
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
    public void coding() {
        System.out.println("Can coding.");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
