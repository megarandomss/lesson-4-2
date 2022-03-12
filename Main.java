public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Ivan", "Petrovich", "Sidorov", 31);
        person1.printName();

//        Person person2 = new Person("Irina", "Pavlovna", "Sokolova");
//        person1.printName();

//        person1.setName("Pavel");
//        person1.printName();
        System.out.println("Год рождения: " + person1.getYearOfBirth() + " г.р.");

    }
}
