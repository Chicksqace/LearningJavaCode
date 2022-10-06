package lesson1;

public class Pet {
    private String name;
    static int hungery;
    private String breet;
    static int num=0;
    public void eat()
    {
        if (hungery>80)
            System.out.println("太饱了，吃不下");
        else
            return ;
    }
    public void bark()
    {
    }

    public int getHungery() {
        return hungery;
    }

    public void setHungery(int hungery) {
        /*this.hungery = hungery;*/
        if (hungery>80)
            System.out.println("太饱了，吃不下");
        else
            System.out.println("快饿死了");
    }
}
