package lesson1;

public class Dog extends Pet{
    private String furColor;

    @Override
    public void eat() {
        System.out.println("爱吃骨头");
    }

    @Override
    public void bark() {
        System.out.println("汪汪");
    }
    public void swim()
    {
        System.out.println("捉迷藏游戏");
        hungery= hungery-20;
    }

    public String getFurColor() {
        return furColor;
    }

    public Dog setFurColor(String furColor) {
        this.furColor = furColor;
        System.out.println(furColor);
        return this;
    }
}
