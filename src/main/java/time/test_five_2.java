package time;

public class test_five_2 {
    public static void main(String[] args) {
        int s1=0;
        for(int i=12;i<100;i+=3){
            s1+=i;
        }
        System.out.println("所有能被3整除的两位数的和为："+s1);
        int s2=0;
        for(int i=10;i<100;i++){
            s2+=i;
        }
        s2=s2-s1;
        System.out.println("所有不能被3整除的两位数的和为："+s2);
    }
}
