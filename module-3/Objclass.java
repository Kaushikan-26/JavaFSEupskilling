public class Objclass {
    public static void main(String[] args){
        Car car1=new Car("Lamborgini","Avendator",2020);
        Car car2=new Car("BMW","WL400",2025);
        car1.display();
        car2.display();

    }
}
 class Car{
    String make;
    String model;
    int year;
    Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;

    }
    void display(){
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println();

    }
}
