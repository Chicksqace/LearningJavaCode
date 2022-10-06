package test.lesson3;

public abstract class Vehicle {
    private String type;
    private int id;
    public Vehicle(String type,int id){
        this.setType(type);
        this.setId(id);
    }
    abstract void drivedByDriver(Driver who);
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
