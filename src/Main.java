
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person1.setName("Andra");
        person2.setName("Bogdan");
        person3.setName("Maria");
        person1.setAge(24);
        person2.setAge(32);
        person3.setAge(19);
        person1.setMarried(true);
        person2.setMarried(false);
        person3.setMarried(true);



        System.out.println("Name: " + person1.getName() + " have " + person1.getAge() + " years " + person1.getMarried() + " married");
        System.out.println("Name: " + person2.getName() + " have " + person2.getAge() + " years " + person2.getMarried() + " married");
        System.out.println("Name: " + person3.getName() + " have " + person3.getAge() + " years " + person3.getMarried() + " married");

    }
}