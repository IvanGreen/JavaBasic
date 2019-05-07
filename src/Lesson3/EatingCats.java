package Lesson3;

public class EatingCats extends Cats {
    private int food;
    private int plateFood = 25;

    public EatingCats(int _food){
        food = _food;
    }

    public void tryPlusPlateFood(){
        plateFood = plateFood + 5;
        System.out.println("We filled up a bowl for 5 servings. Now in bowl " + plateFood + " servings.\n\n");
    }

    public int setPlateFood(int food){
        plateFood = food;
        return plateFood;
    }

    public int getPlateFood(){
        System.out.println("Now in bowl: " + plateFood);
        return plateFood;
    }

    public void setFood(int _food){
        food = _food;
    }

    public int getFood(){
        return food;
    }

    public void checkPlateFood(int food){
        if(food > getPlateFood()){
            System.out.println("Cat is missing in a bowl of food =(");
            tryPlusPlateFood();
            System.out.println(plateFood);
        }else{
            minEatFood(food);
            satiety(food);
        }
    }

    public void minEatFood(int food){
        plateFood = plateFood - food;
        System.out.println("The cat ate, left in the bowl: " + plateFood);
        setPlateFood(plateFood);
    }

    public void satiety(int food){
        boolean hungry = false;
        if(food > this.food){
            System.out.println("Cat overeating\n\n");
        }else if(food == this.food) {
            hungry = true;
            System.out.println("The cat ate\n\n");
        }else if(food < this.food){
            System.out.println("Cat is not enough food to eat =(");
        }
        }
    }
