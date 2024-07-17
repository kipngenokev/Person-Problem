public class Main {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setFirstName("Peter");
        person1.setLastName("");
        person1.setAge(30);
        System.out.println("fullname ="+person1.getFullName());
        System.out.println("teen ="+person1.isTeen());
    }
}