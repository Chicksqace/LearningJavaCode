package part2;
import com.yzk18.commons.IOHelpers;

import java.io.File;
import java.util.Arrays;

public class 案例MP4拷贝新文件夹2 {
    public static void main(String[] args) {
        String filesPath[] = IOHelpers.getFilesRecursively("d:/temp/视频/part2", "mp3");//文件夹下的MP3文件
        //System.out.println(Arrays.toString(filesPath));
        for (String filePath : filesPath) {
            //System.out.println(filePath);
            filePath = filePath.replace("\\", "/");//这样无论是Windows还是其他操作系统，这样路径分隔符都统一为/
            String file[] = filePath.split("/");//按照“/”分割
            //System.out.println(Arrays.toString(file));
            String strs[] = file[file.length - 1].split("-");//将作者名和音乐名分割开
            //System.out.println(Arrays.toString(strs));
            String singerName = strs[0];//作者名
            //System.out.println(singerName);
            File dir = new File("d:/temp/视频/" + singerName);
            if (!dir.exists()) {//如果文件不存在
                dir.mkdirs();//创建文件
            }
            String musicName = strs[1];//歌曲名“ 体面 (多语言版).mp3”
            //System.out.println(musicName);
            String flodrName = dir.getPath().trim() + "\\";//d:\temp\视频\DJ彼岸\
            //System.out.println(flodrName);
            String outputFileName = flodrName + musicName;//d:\temp\视频\DJ彼岸\ 【抖音神曲】《你说》你说你渴望不同的明天，哪怕路途遥远.mp3
            //System.out.println(outputFileName);
            byte bytes[] = IOHelpers.readAllBytes(filePath);//读文件
            IOHelpers.writeAllBytes(outputFileName, bytes);//写文件，复制作用
        }
    }
}