// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person=new Person("Adam","Human");
        System.out.println(person);
        person.learn();
        person.walk();
        person.eat();
        Programmer programmer=new Programmer("Baikal","Programmer");
        programmer.setCompanyName(", CompanyName: Google");
        System.out.println(programmer+programmer.getCompanyName());
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        Dancer dancer=new Dancer("Ira","Dancer");
        dancer.setGroupName(", GroupName: Bolvanchinki");
        System.out.println(dancer+dancer.getGroupName());
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        Singer singer=new Singer("Yeat","Singer");
        singer.setBandName(", BandName: Opium");
        System.out.println(singer+singer.getBandName());
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
    }
}