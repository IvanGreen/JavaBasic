package Lesson3;

public abstract class Animals {
    private String name;
    private int age;
    private int run;
    private int swim;
    private int jump;
    private final int maxRunDogs = 500;
    private final double maxJumpDogs = 0.5;
    private final double maxSwimDogs = 10;
    private final int maxRunCats = 200;
    private final double maxJumpCats = 2;
    private final double maxSwimCats = 0;

    public Animals(){
        this.name = "unknown";
        this.age = 0;
    }

    public void run(String type, int _run){
        boolean result;
        if(type == "cats"){
            if(_run > maxRunCats){
                result = false;
            } else{
                result = true;
            }
        }else{
            if(_run > maxRunDogs){
                result = false;
            }else{
                result = true;
            }
        }
        System.out.println("Attempt to run on " + _run + " meters: " + result);
    }

    public void jump(String type, int _jump){
        boolean result;
        if(type == "cats"){
            if(_jump > maxJumpCats){
                result = false;
            } else{
                result = true;
            }
        }else{
            if(_jump > maxJumpDogs){
                result = false;
            }else{
                result = true;
            }
        }
        System.out.println("Attempt to jump on" + _jump + " meters: " + result);
    }

    public void swim(String type, int _swim){
        boolean result;
        if(type == "cats"){
            if(_swim >= maxSwimCats){
                result = false;
            } else{
                result = true;
            }
        }else{
            if(_swim > maxSwimDogs){
                result = false;
            }else{
                result = true;
            }
        }
        System.out.println("Attempt to swim on " + _swim + " meters: " + result);
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setRun(int run){
        this.run = run;
    }

    public int getRun(){
        return run;
    }

    public void setSwim(int swim){
        this.swim = swim;
    }

    public int getSwim(){
        return swim;
    }

    public void setJump(int jump){
        this.jump = jump;
    }

    public int getJump() {
        return jump;
    }
}
