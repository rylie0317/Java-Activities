class Student {
    private String name = "Shenron";
    private int age = 15;
    private String hobbies = "gaming and sleeping";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    void introduce() {
        System.out.println("--- Introduction ---");
        System.out.println("Hi! My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My hobbies are " + hobbies + ".");
        System.out.println("And I am very handsome!");
        System.out.println("And I can dance, baby!");
    }

    void dancing() {
        System.out.println("\n--- Activity Update ---");
        System.out.println(name + " is dancing!");
    }

    void playingGames() {
        System.out.println(name + " is playing games!");
    }

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.introduce();
        s.dancing();
        s.playingGames();

        // Change values by using getters and setters
        s.setName("Dylan");
        s.setAge(16);

        // After using getters and stter
        System.out.println("--- Updated Information ---");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("");

        s.introduce();
    }
}
}
