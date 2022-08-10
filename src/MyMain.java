public class MyMain {

    public static void main(String[] args) {

        Animals lion = new Animals();
        Animals zebra = new Animals();
        Animals tiger = new Animals();

        ZooPark name = new ZooPark();
        ZooPark city = new ZooPark();
        ZooPark amount = new ZooPark();
        ZooPark cage = new ZooPark();

        lion.age = 5;
        lion.gender = Gender.MALE;
        lion.name = "Leon";
        lion.weight = 250.5;

        tiger.age = 8;
        tiger.gender = Gender.FEMALE;
        tiger.name = "Tiger";
        tiger.weight = 200.5;

        zebra.age = 3;
        zebra.gender = Gender.FEMALE;
        zebra.name = "Zebra";
        zebra.weight = 280.5;

        System.out.println("Animal name: " + lion.name);
        System.out.println("Animal weight: " + lion.weight);
        System.out.println("Animal gender: " + lion.gender);
        System.out.println("Animal age: " + lion.age);
        System.out.println("______________________________");

        System.out.println("Animal name: " + tiger.name);
        System.out.println("Animal weight: " + tiger.weight);
        System.out.println("Animal gender: " + tiger.gender);
        System.out.println("Animal age: " + tiger.age);
        System.out.println("______________________________");

        System.out.println("Animal name: " + zebra.name);
        System.out.println("Animal weight: " + zebra.weight);
        System.out.println("Animal gender: " + zebra.gender);
        System.out.println("Animal age: " + zebra.age);
        System.out.println("______________________________");

        System.out.println("__________________________________________");

        Schoolclass a1 = new Schoolclass();
        a1.name = "Seelöwe";
        a1.amount = 25;
        a1.type = "Math";


        System.out.println("Class name: " + a1.name);
        System.out.println("Class amount: " + a1.amount);
        System.out.println("Class type: " + a1.type);


    }
}
