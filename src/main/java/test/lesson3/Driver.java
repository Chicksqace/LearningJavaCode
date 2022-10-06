package test.lesson3;

public abstract class Driver {
    private String gender;
    private int age;

    public Driver(String gender,int age){
        this.setGender(gender);
        this.setAge(age);
    }
    abstract void drives(Vehicle v);
    //通过方法在后面调用时进行获取值
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
