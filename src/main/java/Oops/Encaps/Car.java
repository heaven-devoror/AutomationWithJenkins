package Oops.Encaps;

public class Car {
    private String maker;
    private String model;
    private  int year;

    public Car(String maker, String model, int year){
//        setMaker(maker);
//        setModel(model);
//        setYear(year);
        this.maker = maker;
        this.model = model;
        this.year = year;
    }

    public void display()
    {
        System.out.println("Maker :" + this.maker + " Model :" + this.model + " Year:"+ this.year);
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
