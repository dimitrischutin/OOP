public class MyMain {

    public static void main(String[] args) {



        Animals lion = new Animals("Löwin", 120, 3, Gender.FEMALE);
        Animals zebra = new Animals("Zebra", 150, 2, Gender.FEMALE);
        Animals tiger = new Animals("Tiger", 200, 5, Gender.MALE);

        ZooPark tierPark = new ZooPark("Hellabrunn", "München",250,100);
        System.out.println(tierPark.name);
        System.out.println(tierPark.city);
        System.out.println(tierPark.amount);
        System.out.println(tierPark.cage);





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




    }
}
