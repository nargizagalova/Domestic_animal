public class Main {
    public static void main(String[] args) {

        Cow[] cows = new Cow[]{
                new Cow(300, 5, "male", "Kira"),
                new Cow(300, 5, "male", "Kira"),
                new Cow(300, 5, "male", "Kira"),
                new Cow(300, 5, "male", "Kira"),
                new Cow(300, 5, "male", "Kira"),
        };

        Horse[] horses = new Horse[]{
                new Horse(300, 5, "male", "Kira"),
                new Horse(300,3,"mele","Kira")
        };

        Sheep[] sheeps = new Sheep[]{
                new Sheep(120, 5, "male", "Kira"),
                new Sheep(130, 5, "male", "Kira"),
                new Sheep(140, 5, "male", "Kira"),
        };

        Farm farm = new Farm("Peliaeva",cows,horses,sheeps,"Edvard");
        Farm farm1 = new Farm("Panfilovka", cows,horses,sheeps, "Edvarg");

        System.out.println(farm);
        System.out.println(farm1);


    }

    }
