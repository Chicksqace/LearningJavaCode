package part2;

import java.io.File;

public class File测试2 {
    public static void main(String[] args) {
        File f1=new File("d:/temp/a/b/1.txt");
        //f1.mkdirs();
        f1.getParentFile().mkdirs();
    }
}
