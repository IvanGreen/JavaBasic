package Lesson3;

public class MainClass {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Ivan", " Ivanov", "Junior", 20);
        manager1.printInfo();

        System.out.println("\n\nAge filter: \n\n");

        Manager[] managers = new Manager[5];
        managers[0] = new Manager("Evgeniy", "Evgeniev", "Manager",18);
        managers[1] = new Manager("Oleg","Shafutinski","Shef",65);
        managers[2] = new Manager("Boris","Moiseev","Relocator",80);
        managers[3] = new Manager("Igor","Karpov","Bird-manager",100);
        managers[4] = new Manager("Vasilyi","Pupkin","IT Worker",32);
        for (int i = 0; i < managers.length; i++){ //filter 40 years
            if(managers[i].getAge() > 40){
                managers[i].printInfo();
            }
        }

        System.out.println("Task with Animals: \n\n");

        Dogs dog1 = new Dogs("Bobik",2,500,10,0.5);
        Dogs dog2 = new Dogs("Sharik",1,300,5,0.3);


        Cats cat1 = new Cats("Pushok",1,200,0,2,5);
        Cats cat2 = new Cats("Koten",4,100,0,1,9);

        System.out.println("\n\nLets run!\n\n");

        cat1.run("cats",150);
        dog1.run("dogs",350);
        dog2.run("dogs",800);

        System.out.println("\n\nLet's jump!\n\n");

        cat1.jump("cats",2);
        dog2.jump("dogs",20);

        System.out.println("\n\nLet's drown the cat! :D\n\n");

        cat2.swim("cats",5);
        dog1.swim("dogs",2);

        System.out.println("\n\nLet's get some food to cat :)\n\n");

        EatingCats[] eatingCats = new EatingCats[3];
        eatingCats[0] = new EatingCats(5);
        eatingCats[1] = new EatingCats(10);
        eatingCats[2] = new EatingCats(30);

        PlateFood plateFood = new PlateFood(25);

        eatingCats[2].checkPlateFood(100);
        eatingCats[0].checkPlateFood(5);
        eatingCats[0].checkPlateFood(10);
        eatingCats[1].checkPlateFood(5);

        System.out.println("\n\nLet's eat from one bowl\n\n");

        plateFood.checkPlateFood(eatingCats[0].getFood());
        plateFood.checkPlateFood(eatingCats[1].getFood());
        plateFood.checkPlateFood(eatingCats[2].getFood());
    }
}