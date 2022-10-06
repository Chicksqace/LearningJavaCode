package part2;

import com.yzk18.GUI.GUI;
import com.yzk18.commons.IOHelpers;

import java.io.File;
import java.util.Arrays;

public class 文件夹拷贝 {
    public static void main(String[] args) {
        String srcDir=GUI.dirOpenBox("请选择源文件夹");
        String desDir=GUI.dirOpenBox("请选择目标文件夹");
        //递归
        File srcFile=new File(srcDir);
        File[] files= srcFile.listFiles();
        /*for(int i=0;i<files.length;i++)
        {
            File file=files[i];
            if (file.isDirectory())//如果有文件夹直接跳过
            {
                continue;
            }
            GUI.showProgressDialog("正在拷贝"+file.getName(),i,files.length);
            String desFileName=desDir+"/"+file.getName();
            byte[] bytes= IOHelpers.readAllBytes(file);
            IOHelpers.writeAllBytes(desFileName,bytes);
        }*/
        int i=0;
        for (File file:srcFile.listFiles())//增强for循环拿到i
        {
            if (file.isDirectory())//如果有文件夹直接跳过
            {
                continue;
            }
            GUI.showProgressDialog("正在拷贝"+file.getName(),i,files.length);
            String desFileName=desDir+"/"+file.getName();
            byte[] bytes= IOHelpers.readAllBytes(file);
            IOHelpers.writeAllBytes(desFileName,bytes);
            i++;
        }
        GUI.closeProgressDialog();
        GUI.msgBox("搞定");
        //String[] files=IOHelpers.getFilesRecursively(srcDir,null);
        //System.out.println(Arrays.toString(files));
    }
}
