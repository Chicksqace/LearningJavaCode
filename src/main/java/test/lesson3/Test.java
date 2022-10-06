package test.lesson3;

public class Test {
    public static void main(String[] args){
        FemaleDriver fd=new FemaleDriver("female",26);
        MaleDriver md=new MaleDriver("male",28);

        Bus vb=new Bus("Bus",001);
        Car vc=new Car("Car",002);

        fd.drives(vc);
        md.drives(vb);

        vb.drivedByDriver(md);
        vc.drivedByDriver(fd);
    }
}
