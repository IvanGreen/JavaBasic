package Lesson3;

public class PlateFood {
    private int plateFood;

    public PlateFood(int _food) {
        plateFood = _food;
    }

    public void setPlateFood(int _food) {
        plateFood = getPlateFood() + _food;
        System.out.println("We added " + _food + " portions. Now on the plate " + getPlateFood() + " portions!\n\n");
    }

    public int getPlateFood() { //узнаем сколько в тарелке
        return plateFood;
    }

    public void checkPlateFood(int food) {
        while (true) {
            if (food > getPlateFood()) {
                System.out.println("Cat lacks portions of food in a bowl. Let's add some food!\n\n");
                setPlateFood(10);
            } else {
                System.out.println("Cat ate");
                eatTry(food);
                break;
            }
        }
    }

    public void eatTry (int food){ //убираем скушанное из общей миски.
        plateFood = getPlateFood() - food;
        System.out.println("In the bowl left: " + getPlateFood() + " portions.\n\n");
    }
}
