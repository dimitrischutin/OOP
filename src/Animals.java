public class Animals {

   private int id;
    String name;
    double weight;
    int age;
    Gender gender;

    @Override
    public String toString() {
        return "Animals{" +
                "номер животного = " + id +
                ", name = '" + name + '\'' +
                ", weight = " + weight +
                ", age = " + age +
                ", gender = " + gender +
                '}';
    }

    public Animals(int id, String name, double weight, int age, Gender gender) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.id = id;

    }


}

