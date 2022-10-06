package test.lesson3;

public class Car extends Vehicle{
    Car(String type,int id){
        super(type,id);
    }
    void drivedByDriver(Driver who){
        System.out.println("A "+who.getGender()+" "+who.getAge()+" years old "+" drives a car.");
    }
}
