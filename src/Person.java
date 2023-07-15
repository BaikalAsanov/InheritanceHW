public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Name: "+getName()+
                ", "+"Designation: "+getDesignation();
    }
}
