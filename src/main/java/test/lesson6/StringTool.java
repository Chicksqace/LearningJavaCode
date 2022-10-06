package test.lesson6;
public class StringTool {
    public static void main(String[] args) {
        String str="To2da2y i3s Mon633day";
        String[] arr=str.split(" ");
        int sum=0;
        for (String ss:arr)
        {
             System.out.println(ss);
        }
            for(int i=0;i<str.length();i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    sum ++;
                }
        }
            System.out.println("sum="+sum);
    }
}
