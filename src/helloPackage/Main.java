package helloPackage;

public class Main {

    public static void main(String[] args) {

        Student neal = new Student();//Neal->Object or instance
        neal.setAge(30);
        neal.setName("Neal");
        neal.setId(3337772);

        System.out.println(neal.getName() + " is " + neal.getAge() + " years old");

        //2nd instance of Student class(below)
        //OLD WAY, before Encapsulation
        Student tom = new Student();
        tom.age = 22;
        tom.name = "tom";
        tom.id = 22262;

        System.out.println(tom.name + " is " + tom.age + " years old");




    }
}
