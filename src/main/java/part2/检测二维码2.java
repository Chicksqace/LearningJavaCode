package part2;

import com.google.zxing.Result;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.QRCodeHelpers;

import javax.naming.spi.DirStateFactory;
import java.util.Arrays;

public class 检测二维码2 {
    public static void main(String[] args) {
        String files[] = IOHelpers.getFilesRecursively("d:/temp", "jpg", "png");
        System.out.println(Arrays.toString(files));
        Boolean make=false;
        for (String file : files) {
            Result qrcode = QRCodeHelpers.parseImage(file);
            //System.out.println(qrcode);
            if (qrcode == null)
            {
                continue;
                //System.out.println("检测通过");
                //make=true;
            }
            else
            {
                if (qrcode.getText().contains("http")||qrcode.getText().contains("https"))
                {
                    //System.out.println("有宣传性二维码图片");
                    make=false;
                    break;
                }
                else
                {
                    //System.out.println("检测通过");
                    make=true;
                    break;
                }
            }
        }
        //System.out.println(make);
        if (make==true)
        {
            System.out.println("检测通过");
        }
        else
        {
            System.out.println("有宣传性二维码图片");
        }

    }
}
