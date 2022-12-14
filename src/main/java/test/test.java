package test;
import java.util.*;
    public class test {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int x = input.nextInt();
    int y = input.nextInt(); //如果y >= x，肯定直接选用群体攻击方式
    if(x <= y) {
        int maxBlood = Math.max(a, b);
        int res = (maxBlood - 1) / y + 1;
        System.out.println(res);
    } else if(x <= y * 2) {
        //如果x <= y * 2，也就是说群体攻击伤害值加起来比x大，优先使用群体攻击，直到一个怪物死亡，再使用单体攻击攻击另一个怪物
        int res = 0;
        while(a > 0 && b > 0) {
            a -= y;
            b -= y;
            res += 1;
        }
       while (a>0)
       {
           a-=x;
           res+=1;
       }
       while (b>0)
       {
           b-=x;
           res+=1;
       }
        System.out.println(res);
    } else { //单体攻击伤害值比群体攻击一共的伤害值还要高，优先使用单体攻击，将每个怪物的生命值打到小于等于y的时候，在使用一个群体攻击直接一起带走
         int res = 0; while(a > y)
         { a -= x;
         res += 1; }
        while(b > y) { b -= x;
        res += 1; }
        while (a>0)
        {
            a-=x;
            res+=1;
        }
        while (b>0)
        {
            b-=x;
            res+=1;
        }
        System.out.println(res);
    }
    }
    }
