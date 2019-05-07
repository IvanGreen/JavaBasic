package Lesson3;

public class Dogs extends Animals {

    private String name;
    private int age;
    private int run;
    private int swim;
    private double jump;

    public Dogs(String _name, int _age, int _run, int _swim, double _jump){
        name = _name;
        age = _age;
        run = _run;
        swim = _swim;
        jump = _jump;

    }

    public Dogs(){
        name = "unknown";
        age = 0;
        run = 500;
        swim = 10;
        jump = 0.5;
    }

}
