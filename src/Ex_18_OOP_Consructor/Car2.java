package Ex_18_OOP_Consructor;

public class Car2 {
    String model;
    int year;

    Car2(){
        year = 2000;
        model = "xxx";
        System.out.println("Car2 = DC");
    }

    Car2(String model_name)
    {   this();
        this.model = model_name;
    }
    Car2(String model_name, int year_created) {
        this("i20");
        this.model = model_name;
        this.year = year_created;
    }

}
