public class Dancer extends Person{
    private String groupName;

    public String getGroupName() {
        return groupName;
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
    public void dancing() {
        System.out.println("Can dancing.");
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation) {
        super(name, designation);

    }
}
