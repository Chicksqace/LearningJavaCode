package time;

public class test_five_3 {

        public static void main(String[] args) {
            int n =1;
            double sum = 1;
            double fac = 1;
            do{
                fac = fac*n;  //在上一次计算出的阶乘的基础上计算（ n! = (n-1)!*n )
                sum += 1/fac;
                n++;
            }while(1/fac >= 1E-6);
            System.out.println(sum);
        }

    }


