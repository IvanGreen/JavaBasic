package Lesson3;

public class Cats extends Animals { // пятое задание

    private String name;
    private int age;
    private int run;
    private int swim;
    private double jump;


    public Cats(String _name, int _age, int _run, int _swim, double _jump, int _food){
        name = _name;
        age = _age;
        run = _run;
        swim = _swim;
        jump = _jump;

    }

    public Cats(){
        name = "unknown";
        age = 0;
        run = 200;
        swim = 0;
        jump = 2;
    }

}
