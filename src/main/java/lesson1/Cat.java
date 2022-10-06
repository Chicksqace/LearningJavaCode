package lesson1;

public class Cat extends Pet{
    private String eyeColor;

    @Override
    public void eat() {
        System.out.println("爱吃鱼");
    }

    @Override
    public void bark() {
        System.out.println("喵喵");
    }
    public void hide()
    {
        System.out.println("捉迷藏游戏");
        hungery=hungery-10;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Cat setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        System.out.println(eyeColor);
        return this;
    }
}
