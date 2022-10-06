package part2;

import com.yzk18.commons.IOHelpers;

import java.io.File;

public class 案例mp4拷贝到新文件夹 {
    public static void main(String[] args) {
        File file =new File("d:/temp/视频");
        File[] dirs=file.listFiles();
        for (File dir:dirs)//先遍历文件夹
        {
            for (File fileMp4:dir.listFiles())//再遍历文件夹下的文件
            {
                //System.out.println(fileMp4);
                String filePath=fileMp4.getPath();//把File转换为字符串，方便用split等方法
                //System.out.println(filePath);
                filePath=filePath.replace("\\","/");//这样无论是Windows还是其他操作系统，这样路径分隔符都统一为/
                String[]strs=filePath.split("/");
                String folderName=strs[strs.length-2];//倒数第一是文件夹的名字
                //System.out.println(folderName);
                String fileName=strs[strs.length-1];//倒数第0个是文件的名字
                //System.out.println(fileName);
                String outputFileName="D:\\temp\\视频\\output\\"+folderName+"-"+fileName;
                //System.out.println(outputFileName);
                byte[] bytes=IOHelpers.readAllBytes(fileMp4);//文件内容
                IOHelpers.writeAllBytes(outputFileName,bytes);//写入新文件

            }
        }

    }

}
