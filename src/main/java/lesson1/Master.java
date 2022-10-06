package lesson1;
public class Master {
    private String name;
    public void feed(Pet pet)
    {
        pet.eat();
        pet.setHungery(hashCode()+10);
    }
    public void amuse(Pet pet)
    {
        pet.bark();
    }
}
