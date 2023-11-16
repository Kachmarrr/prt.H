public class Main {
    public static void main(String[] args) {

        Athlete athlete1 = new Athlete("ALex", 19);

        athlete1.setName("Andriy");
        athlete1.setAge(20);

        System.out.println(athlete1.getName());
        System.out.println(athlete1.getAge());
    }
}

public class Athlete {

    private String Name;
    private int Age;

    Athlete(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

    public int setName(String name) {
        Name = name;
        return 0;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
}
