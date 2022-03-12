import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private String name;
    private String middleName;
    private String familyName;
    private int age;


    public Person(String name, String middleName, String familyName, int age) {
        this.familyName = familyName;
        this.name = name;
        this.middleName = middleName;
        this.age = age;
    }

    public void printName() {
        System.out.println("Имя: " + name);
    }


    public void setName(String name) {
        if (name.length() >= 2){
        this.name = name;}
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        Calendar dt = new GregorianCalendar();
        int year = dt.get(Calendar.YEAR);
        return (year - age);
    }

    public void printAge() {
        System.out.println("Возраст: " + age);
    }
}
