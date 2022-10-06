package part2;

import com.google.zxing.Result;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.QRCodeHelpers;

import java.util.Arrays;

public class 检测二维码 {
    public static void main(String[] args) {
        String[] files=IOHelpers.getFilesRecursively("D:\\temp\\img","png","jpg","gif");//将文件夹下的"png","jpg","gif"文件找到
        //System.out.println(Arrays.toString(files));
        Boolean qrcodeFound=false;
        for (String file:files)
        {
            //经过试验发现，如果图片没有二维码返回值为null
            Result result=QRCodeHelpers.parseImage(file);//尝试从file这个文件中解析出来条形码。
            //System.out.println(result);
            if (result!=null)//只要找到一个二维码就退出，结果为true
            {
                //System.out.println("有二维码");
                qrcodeFound=true;
                break;
            }
            if (qrcodeFound=true)
            {
                System.out.println("有二维码");
            }
            else
            {
                System.out.println("没有二维码");
            }
        }
    }
}
