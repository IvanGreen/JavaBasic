package Lesson3;

public class Manager {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phoneNumber;
    private int money;
    private int age;

    public Manager( String _firstName, String _lastName, String _position, int _age){
        firstName = _firstName;
        lastName = _lastName;
        position = _position;
        age = _age;
        money = 45000;
        email = "unknown@unknown.com";
        phoneNumber = "+7(000)000-00-00";
    }

    public Manager(){
        firstName = "unknown";
        lastName = "unknown";
        position = "unknown";
        age = 20;
        money = 45000;
        email = "unknown@unknown.com";
        phoneNumber = "+7(000)000-00-00";
    }

    public void setAge(int age){
        if (age > 0)
            this.age = age;
        else
            System.out.println("Invalid age entered");
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public  String getPosition(){
        return position;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setPhoneNumber(String number){
        this.phoneNumber = number;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setMoney(int money){
        if (money > 0)
            this.money = money;
        else
            System.out.println("Invalid amount entered");
    }

    public int getMoney(){
        return money;
    }

    public void printInfo() {
        System.out.println("Employee: " + this.firstName + " " + this.lastName + "\nAt the age of: "
                + this.age + " years" + "\nIs in position: " + this.position + "\nEmail: "
                + this.email + "\nTelephone: " + this.phoneNumber + "\nSalary : " + this.money +
                " Rubles\n\n");
    }
}